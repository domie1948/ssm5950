package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShitangEntity;
import com.entity.view.ShitangView;

import com.service.ShitangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 食堂
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-22 19:57:30
 */
@RestController
@RequestMapping("/shitang")
public class ShitangController {
    @Autowired
    private ShitangService shitangService;
    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		ShitangEntity user = shitangService.selectOne(new EntityWrapper<ShitangEntity>().eq("shitanghao", username));
		if(user==null || !user.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
		String token = tokenService.generateToken(user.getId(), username,"shitang",  "管理员" );
		return R.ok().put("token", token);
	}
	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody ShitangEntity shitang){
    	//ValidatorUtils.validateEntity(shitang);
    	ShitangEntity user = shitangService.selectOne(new EntityWrapper<ShitangEntity>().eq("shitanghao", shitang.getShitanghao()));
		if(user!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		shitang.setId(uId);
        shitangService.insert(shitang);
        return R.ok();
    }
	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        ShitangEntity user = shitangService.selectById(id);
        return R.ok().put("data", user);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	ShitangEntity user = shitangService.selectOne(new EntityWrapper<ShitangEntity>().eq("shitanghao", username));
    	if(user==null) {
    		return R.error("账号不存在");
    	}
        user.setMima("123456");
        shitangService.updateById(user);
        return R.ok("密码已重置为：123456");
    }


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShitangEntity shitang, HttpServletRequest request){

        EntityWrapper<ShitangEntity> ew = new EntityWrapper<ShitangEntity>();
    	PageUtils page = shitangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shitang), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShitangEntity shitang, HttpServletRequest request){
        EntityWrapper<ShitangEntity> ew = new EntityWrapper<ShitangEntity>();
    	PageUtils page = shitangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shitang), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShitangEntity shitang){
       	EntityWrapper<ShitangEntity> ew = new EntityWrapper<ShitangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shitang, "shitang")); 
        return R.ok().put("data", shitangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShitangEntity shitang){
        EntityWrapper< ShitangEntity> ew = new EntityWrapper< ShitangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shitang, "shitang")); 
		ShitangView shitangView =  shitangService.selectView(ew);
		return R.ok("查询食堂成功").put("data", shitangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShitangEntity shitang = shitangService.selectById(id);
        return R.ok().put("data", shitang);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShitangEntity shitang = shitangService.selectById(id);
        return R.ok().put("data", shitang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShitangEntity shitang, HttpServletRequest request){
    	shitang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shitang);
    	ShitangEntity user = shitangService.selectOne(new EntityWrapper<ShitangEntity>().eq("shitanghao", shitang.getShitanghao()));
		if(user!=null) {
			return R.error("用户已存在");
		}

		shitang.setId(new Date().getTime());
        shitangService.insert(shitang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShitangEntity shitang, HttpServletRequest request){
    	shitang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shitang);
    	ShitangEntity user = shitangService.selectOne(new EntityWrapper<ShitangEntity>().eq("shitanghao", shitang.getShitanghao()));
		if(user!=null) {
			return R.error("用户已存在");
		}

		shitang.setId(new Date().getTime());
        shitangService.insert(shitang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShitangEntity shitang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shitang);
        shitangService.updateById(shitang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shitangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShitangEntity> wrapper = new EntityWrapper<ShitangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = shitangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}

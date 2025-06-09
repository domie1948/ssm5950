package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShitangcaidanDao;
import com.entity.ShitangcaidanEntity;
import com.service.ShitangcaidanService;
import com.entity.vo.ShitangcaidanVO;
import com.entity.view.ShitangcaidanView;

@Service("shitangcaidanService")
public class ShitangcaidanServiceImpl extends ServiceImpl<ShitangcaidanDao, ShitangcaidanEntity> implements ShitangcaidanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShitangcaidanEntity> page = this.selectPage(
                new Query<ShitangcaidanEntity>(params).getPage(),
                new EntityWrapper<ShitangcaidanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShitangcaidanEntity> wrapper) {
		  Page<ShitangcaidanView> page =new Query<ShitangcaidanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShitangcaidanVO> selectListVO(Wrapper<ShitangcaidanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShitangcaidanVO selectVO(Wrapper<ShitangcaidanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShitangcaidanView> selectListView(Wrapper<ShitangcaidanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShitangcaidanView selectView(Wrapper<ShitangcaidanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

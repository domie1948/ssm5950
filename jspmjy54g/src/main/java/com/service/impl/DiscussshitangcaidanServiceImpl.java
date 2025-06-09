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


import com.dao.DiscussshitangcaidanDao;
import com.entity.DiscussshitangcaidanEntity;
import com.service.DiscussshitangcaidanService;
import com.entity.vo.DiscussshitangcaidanVO;
import com.entity.view.DiscussshitangcaidanView;

@Service("discussshitangcaidanService")
public class DiscussshitangcaidanServiceImpl extends ServiceImpl<DiscussshitangcaidanDao, DiscussshitangcaidanEntity> implements DiscussshitangcaidanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshitangcaidanEntity> page = this.selectPage(
                new Query<DiscussshitangcaidanEntity>(params).getPage(),
                new EntityWrapper<DiscussshitangcaidanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshitangcaidanEntity> wrapper) {
		  Page<DiscussshitangcaidanView> page =new Query<DiscussshitangcaidanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshitangcaidanVO> selectListVO(Wrapper<DiscussshitangcaidanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshitangcaidanVO selectVO(Wrapper<DiscussshitangcaidanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshitangcaidanView> selectListView(Wrapper<DiscussshitangcaidanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshitangcaidanView selectView(Wrapper<DiscussshitangcaidanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

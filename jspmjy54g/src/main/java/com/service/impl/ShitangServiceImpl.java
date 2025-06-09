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


import com.dao.ShitangDao;
import com.entity.ShitangEntity;
import com.service.ShitangService;
import com.entity.vo.ShitangVO;
import com.entity.view.ShitangView;

@Service("shitangService")
public class ShitangServiceImpl extends ServiceImpl<ShitangDao, ShitangEntity> implements ShitangService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShitangEntity> page = this.selectPage(
                new Query<ShitangEntity>(params).getPage(),
                new EntityWrapper<ShitangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShitangEntity> wrapper) {
		  Page<ShitangView> page =new Query<ShitangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShitangVO> selectListVO(Wrapper<ShitangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShitangVO selectVO(Wrapper<ShitangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShitangView> selectListView(Wrapper<ShitangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShitangView selectView(Wrapper<ShitangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

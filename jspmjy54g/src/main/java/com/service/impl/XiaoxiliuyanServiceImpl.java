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


import com.dao.XiaoxiliuyanDao;
import com.entity.XiaoxiliuyanEntity;
import com.service.XiaoxiliuyanService;
import com.entity.vo.XiaoxiliuyanVO;
import com.entity.view.XiaoxiliuyanView;

@Service("xiaoxiliuyanService")
public class XiaoxiliuyanServiceImpl extends ServiceImpl<XiaoxiliuyanDao, XiaoxiliuyanEntity> implements XiaoxiliuyanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoxiliuyanEntity> page = this.selectPage(
                new Query<XiaoxiliuyanEntity>(params).getPage(),
                new EntityWrapper<XiaoxiliuyanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoxiliuyanEntity> wrapper) {
		  Page<XiaoxiliuyanView> page =new Query<XiaoxiliuyanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoxiliuyanVO> selectListVO(Wrapper<XiaoxiliuyanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoxiliuyanVO selectVO(Wrapper<XiaoxiliuyanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoxiliuyanView> selectListView(Wrapper<XiaoxiliuyanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoxiliuyanView selectView(Wrapper<XiaoxiliuyanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

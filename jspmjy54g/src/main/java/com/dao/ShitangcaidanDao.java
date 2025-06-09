package com.dao;

import com.entity.ShitangcaidanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShitangcaidanVO;
import com.entity.view.ShitangcaidanView;


/**
 * 食堂菜单
 * 
 * @author 
 * @email 
 * @date 2021-02-22 19:57:30
 */
public interface ShitangcaidanDao extends BaseMapper<ShitangcaidanEntity> {
	
	List<ShitangcaidanVO> selectListVO(@Param("ew") Wrapper<ShitangcaidanEntity> wrapper);
	
	ShitangcaidanVO selectVO(@Param("ew") Wrapper<ShitangcaidanEntity> wrapper);
	
	List<ShitangcaidanView> selectListView(@Param("ew") Wrapper<ShitangcaidanEntity> wrapper);

	List<ShitangcaidanView> selectListView(Pagination page,@Param("ew") Wrapper<ShitangcaidanEntity> wrapper);
	
	ShitangcaidanView selectView(@Param("ew") Wrapper<ShitangcaidanEntity> wrapper);
	
}

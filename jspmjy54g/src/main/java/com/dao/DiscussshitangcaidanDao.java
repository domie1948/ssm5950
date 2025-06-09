package com.dao;

import com.entity.DiscussshitangcaidanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshitangcaidanVO;
import com.entity.view.DiscussshitangcaidanView;


/**
 * 食堂菜单评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-22 19:57:30
 */
public interface DiscussshitangcaidanDao extends BaseMapper<DiscussshitangcaidanEntity> {
	
	List<DiscussshitangcaidanVO> selectListVO(@Param("ew") Wrapper<DiscussshitangcaidanEntity> wrapper);
	
	DiscussshitangcaidanVO selectVO(@Param("ew") Wrapper<DiscussshitangcaidanEntity> wrapper);
	
	List<DiscussshitangcaidanView> selectListView(@Param("ew") Wrapper<DiscussshitangcaidanEntity> wrapper);

	List<DiscussshitangcaidanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshitangcaidanEntity> wrapper);
	
	DiscussshitangcaidanView selectView(@Param("ew") Wrapper<DiscussshitangcaidanEntity> wrapper);
	
}

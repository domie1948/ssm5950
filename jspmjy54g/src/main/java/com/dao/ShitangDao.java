package com.dao;

import com.entity.ShitangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShitangVO;
import com.entity.view.ShitangView;


/**
 * 食堂
 * 
 * @author 
 * @email 
 * @date 2021-02-22 19:57:30
 */
public interface ShitangDao extends BaseMapper<ShitangEntity> {
	
	List<ShitangVO> selectListVO(@Param("ew") Wrapper<ShitangEntity> wrapper);
	
	ShitangVO selectVO(@Param("ew") Wrapper<ShitangEntity> wrapper);
	
	List<ShitangView> selectListView(@Param("ew") Wrapper<ShitangEntity> wrapper);

	List<ShitangView> selectListView(Pagination page,@Param("ew") Wrapper<ShitangEntity> wrapper);
	
	ShitangView selectView(@Param("ew") Wrapper<ShitangEntity> wrapper);
	
}

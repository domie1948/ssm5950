package com.dao;

import com.entity.CaixifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaixifenleiVO;
import com.entity.view.CaixifenleiView;


/**
 * 菜系分类
 * 
 * @author 
 * @email 
 * @date 2021-02-22 19:57:30
 */
public interface CaixifenleiDao extends BaseMapper<CaixifenleiEntity> {
	
	List<CaixifenleiVO> selectListVO(@Param("ew") Wrapper<CaixifenleiEntity> wrapper);
	
	CaixifenleiVO selectVO(@Param("ew") Wrapper<CaixifenleiEntity> wrapper);
	
	List<CaixifenleiView> selectListView(@Param("ew") Wrapper<CaixifenleiEntity> wrapper);

	List<CaixifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<CaixifenleiEntity> wrapper);
	
	CaixifenleiView selectView(@Param("ew") Wrapper<CaixifenleiEntity> wrapper);
	
}

package com.dao;

import com.entity.XiaoxiliuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoxiliuyanVO;
import com.entity.view.XiaoxiliuyanView;


/**
 * 消息留言
 * 
 * @author 
 * @email 
 * @date 2021-02-22 19:57:30
 */
public interface XiaoxiliuyanDao extends BaseMapper<XiaoxiliuyanEntity> {
	
	List<XiaoxiliuyanVO> selectListVO(@Param("ew") Wrapper<XiaoxiliuyanEntity> wrapper);
	
	XiaoxiliuyanVO selectVO(@Param("ew") Wrapper<XiaoxiliuyanEntity> wrapper);
	
	List<XiaoxiliuyanView> selectListView(@Param("ew") Wrapper<XiaoxiliuyanEntity> wrapper);

	List<XiaoxiliuyanView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoxiliuyanEntity> wrapper);
	
	XiaoxiliuyanView selectView(@Param("ew") Wrapper<XiaoxiliuyanEntity> wrapper);
	
}

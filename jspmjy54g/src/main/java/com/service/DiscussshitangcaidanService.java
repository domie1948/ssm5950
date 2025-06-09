package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshitangcaidanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshitangcaidanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshitangcaidanView;


/**
 * 食堂菜单评论表
 *
 * @author 
 * @email 
 * @date 2021-02-22 19:57:30
 */
public interface DiscussshitangcaidanService extends IService<DiscussshitangcaidanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshitangcaidanVO> selectListVO(Wrapper<DiscussshitangcaidanEntity> wrapper);
   	
   	DiscussshitangcaidanVO selectVO(@Param("ew") Wrapper<DiscussshitangcaidanEntity> wrapper);
   	
   	List<DiscussshitangcaidanView> selectListView(Wrapper<DiscussshitangcaidanEntity> wrapper);
   	
   	DiscussshitangcaidanView selectView(@Param("ew") Wrapper<DiscussshitangcaidanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshitangcaidanEntity> wrapper);
   	
}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShitangcaidanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShitangcaidanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShitangcaidanView;


/**
 * 食堂菜单
 *
 * @author 
 * @email 
 * @date 2021-02-22 19:57:30
 */
public interface ShitangcaidanService extends IService<ShitangcaidanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShitangcaidanVO> selectListVO(Wrapper<ShitangcaidanEntity> wrapper);
   	
   	ShitangcaidanVO selectVO(@Param("ew") Wrapper<ShitangcaidanEntity> wrapper);
   	
   	List<ShitangcaidanView> selectListView(Wrapper<ShitangcaidanEntity> wrapper);
   	
   	ShitangcaidanView selectView(@Param("ew") Wrapper<ShitangcaidanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShitangcaidanEntity> wrapper);
   	
}


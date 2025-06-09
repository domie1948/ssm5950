package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShitangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShitangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShitangView;


/**
 * 食堂
 *
 * @author 
 * @email 
 * @date 2021-02-22 19:57:30
 */
public interface ShitangService extends IService<ShitangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShitangVO> selectListVO(Wrapper<ShitangEntity> wrapper);
   	
   	ShitangVO selectVO(@Param("ew") Wrapper<ShitangEntity> wrapper);
   	
   	List<ShitangView> selectListView(Wrapper<ShitangEntity> wrapper);
   	
   	ShitangView selectView(@Param("ew") Wrapper<ShitangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShitangEntity> wrapper);
   	
}


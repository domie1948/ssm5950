package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaixifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaixifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaixifenleiView;


/**
 * 菜系分类
 *
 * @author 
 * @email 
 * @date 2021-02-22 19:57:30
 */
public interface CaixifenleiService extends IService<CaixifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaixifenleiVO> selectListVO(Wrapper<CaixifenleiEntity> wrapper);
   	
   	CaixifenleiVO selectVO(@Param("ew") Wrapper<CaixifenleiEntity> wrapper);
   	
   	List<CaixifenleiView> selectListView(Wrapper<CaixifenleiEntity> wrapper);
   	
   	CaixifenleiView selectView(@Param("ew") Wrapper<CaixifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaixifenleiEntity> wrapper);
   	
}


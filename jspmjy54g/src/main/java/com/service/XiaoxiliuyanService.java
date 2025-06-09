package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoxiliuyanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoxiliuyanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoxiliuyanView;


/**
 * 消息留言
 *
 * @author 
 * @email 
 * @date 2021-02-22 19:57:30
 */
public interface XiaoxiliuyanService extends IService<XiaoxiliuyanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoxiliuyanVO> selectListVO(Wrapper<XiaoxiliuyanEntity> wrapper);
   	
   	XiaoxiliuyanVO selectVO(@Param("ew") Wrapper<XiaoxiliuyanEntity> wrapper);
   	
   	List<XiaoxiliuyanView> selectListView(Wrapper<XiaoxiliuyanEntity> wrapper);
   	
   	XiaoxiliuyanView selectView(@Param("ew") Wrapper<XiaoxiliuyanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoxiliuyanEntity> wrapper);
   	
}


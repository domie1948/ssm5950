package com.entity.view;

import com.entity.XiaoxiliuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 消息留言
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-22 19:57:30
 */
@TableName("xiaoxiliuyan")
public class XiaoxiliuyanView  extends XiaoxiliuyanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoxiliuyanView(){
	}
 
 	public XiaoxiliuyanView(XiaoxiliuyanEntity xiaoxiliuyanEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoxiliuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

package com.entity.view;

import com.entity.ShitangcaidanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 食堂菜单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-22 19:57:30
 */
@TableName("shitangcaidan")
public class ShitangcaidanView  extends ShitangcaidanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShitangcaidanView(){
	}
 
 	public ShitangcaidanView(ShitangcaidanEntity shitangcaidanEntity){
 	try {
			BeanUtils.copyProperties(this, shitangcaidanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

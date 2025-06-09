package com.entity.vo;

import com.entity.ShitangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 食堂
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-22 19:57:30
 */
public class ShitangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 食堂名
	 */
	
	private String shitangming;
		
	/**
	 * 管理员
	 */
	
	private String guanliyuan;
		
	/**
	 * 食堂照片
	 */
	
	private String shitangzhaopian;
		
	/**
	 * 卫生等级
	 */
	
	private String weishengdengji;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 食堂地址
	 */
	
	private String shitangdizhi;
		
	/**
	 * 余额
	 */
	
	private Float money;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：食堂名
	 */
	 
	public void setShitangming(String shitangming) {
		this.shitangming = shitangming;
	}
	
	/**
	 * 获取：食堂名
	 */
	public String getShitangming() {
		return shitangming;
	}
				
	
	/**
	 * 设置：管理员
	 */
	 
	public void setGuanliyuan(String guanliyuan) {
		this.guanliyuan = guanliyuan;
	}
	
	/**
	 * 获取：管理员
	 */
	public String getGuanliyuan() {
		return guanliyuan;
	}
				
	
	/**
	 * 设置：食堂照片
	 */
	 
	public void setShitangzhaopian(String shitangzhaopian) {
		this.shitangzhaopian = shitangzhaopian;
	}
	
	/**
	 * 获取：食堂照片
	 */
	public String getShitangzhaopian() {
		return shitangzhaopian;
	}
				
	
	/**
	 * 设置：卫生等级
	 */
	 
	public void setWeishengdengji(String weishengdengji) {
		this.weishengdengji = weishengdengji;
	}
	
	/**
	 * 获取：卫生等级
	 */
	public String getWeishengdengji() {
		return weishengdengji;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：食堂地址
	 */
	 
	public void setShitangdizhi(String shitangdizhi) {
		this.shitangdizhi = shitangdizhi;
	}
	
	/**
	 * 获取：食堂地址
	 */
	public String getShitangdizhi() {
		return shitangdizhi;
	}
				
	
	/**
	 * 设置：余额
	 */
	 
	public void setMoney(Float money) {
		this.money = money;
	}
	
	/**
	 * 获取：余额
	 */
	public Float getMoney() {
		return money;
	}
			
}

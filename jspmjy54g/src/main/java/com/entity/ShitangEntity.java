package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 食堂
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-22 19:57:30
 */
@TableName("shitang")
public class ShitangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShitangEntity() {
		
	}
	
	public ShitangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 食堂号
	 */
					
	private String shitanghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：食堂号
	 */
	public void setShitanghao(String shitanghao) {
		this.shitanghao = shitanghao;
	}
	/**
	 * 获取：食堂号
	 */
	public String getShitanghao() {
		return shitanghao;
	}
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

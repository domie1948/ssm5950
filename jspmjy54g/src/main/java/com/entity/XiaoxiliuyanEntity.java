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
 * 消息留言
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-22 19:57:30
 */
@TableName("xiaoxiliuyan")
public class XiaoxiliuyanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaoxiliuyanEntity() {
		
	}
	
	public XiaoxiliuyanEntity(T t) {
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
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 角色
	 */
					
	private String jiaose;
	
	/**
	 * 食堂号
	 */
					
	private String shitanghao;
	
	/**
	 * 食堂名
	 */
					
	private String shitangming;
	
	/**
	 * 订单号
	 */
					
	private String dingdanhao;
	
	/**
	 * 配送分
	 */
					
	private String peisongfen;
	
	/**
	 * 包装分
	 */
					
	private String baozhuangfen;
	
	/**
	 * 菜品分
	 */
					
	private String caipinfen;
	
	/**
	 * 时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shijian;
	
	/**
	 * 建议
	 */
					
	private String jianyi;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：角色
	 */
	public void setJiaose(String jiaose) {
		this.jiaose = jiaose;
	}
	/**
	 * 获取：角色
	 */
	public String getJiaose() {
		return jiaose;
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
	 * 设置：订单号
	 */
	public void setDingdanhao(String dingdanhao) {
		this.dingdanhao = dingdanhao;
	}
	/**
	 * 获取：订单号
	 */
	public String getDingdanhao() {
		return dingdanhao;
	}
	/**
	 * 设置：配送分
	 */
	public void setPeisongfen(String peisongfen) {
		this.peisongfen = peisongfen;
	}
	/**
	 * 获取：配送分
	 */
	public String getPeisongfen() {
		return peisongfen;
	}
	/**
	 * 设置：包装分
	 */
	public void setBaozhuangfen(String baozhuangfen) {
		this.baozhuangfen = baozhuangfen;
	}
	/**
	 * 获取：包装分
	 */
	public String getBaozhuangfen() {
		return baozhuangfen;
	}
	/**
	 * 设置：菜品分
	 */
	public void setCaipinfen(String caipinfen) {
		this.caipinfen = caipinfen;
	}
	/**
	 * 获取：菜品分
	 */
	public String getCaipinfen() {
		return caipinfen;
	}
	/**
	 * 设置：时间
	 */
	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}
	/**
	 * 获取：时间
	 */
	public Date getShijian() {
		return shijian;
	}
	/**
	 * 设置：建议
	 */
	public void setJianyi(String jianyi) {
		this.jianyi = jianyi;
	}
	/**
	 * 获取：建议
	 */
	public String getJianyi() {
		return jianyi;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}

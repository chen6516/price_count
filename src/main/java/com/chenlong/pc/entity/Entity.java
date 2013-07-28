package com.chenlong.pc.entity;

import java.io.Serializable;

/**
 * 实体父类
 * @author chenlong
 * date: 2013-7-5 22:40:13
 *
 */
public class Entity implements Serializable{
	// id
	protected String id;
	
	// 创建时间
	protected Long createDate;
	
	public Entity(){}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return this.id;
	}
	
	public void setCreateDate(long createDate){
		this.createDate = createDate;
	}
	
	public Long getCreateDate(){
		return this.createDate;
	}
}

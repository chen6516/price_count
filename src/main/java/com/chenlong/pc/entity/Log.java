package com.chenlong.pc.entity;

import com.chenlong.pc.util.OperateType;

/**
 * 日志类
 * @author chenlong
 *
 */
public class Log extends Entity{
	
	// 什么操作
	private Byte operate;
	
	// 操作人
	private String personId;
	
	// 属于那个集体
	private String homeId;
		
	public Log() {}
	
	public Log(String id, OperateType operateType, String personId, String homeId, 
			long createDate) {
		super();
		this.id = id;
		this.operate = OperateType.getOrdinal(operateType);
		this.personId = personId;
		this.homeId = homeId;
		this.createDate = createDate;
	}

	public Byte getOperate() {
		return operate;
	}

	public void setOperate(OperateType operateType) {
		this.operate = OperateType.getOrdinal(operateType);
	}

	public void setOperate(Byte operate) {
		this.operate = operate;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getHomeId() {
		return homeId;
	}

	public void setHomeId(String homeId) {
		this.homeId = homeId;
	}
	
}

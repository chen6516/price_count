package com.chenlong.pc.entity;

import com.chenlong.pc.util.ActiveType;

/**
 * 家庭类,代表着一个集体.
 * @author chenlong
 * date: 2013-7-5 22:40:05
 *
 */
public class Home extends Entity{
	
	// 状态  1活动, 0冻结
	private Byte active;

	// 地址
	private String locate;

	// 名称
	private String name;

	// 房东电话
	private String ownerPhone;

	// wifi用户名
	private String wifiName;
	
	// wifi 秘密
	private String wifiPassword;

	public Home(){}

	/**
	 * 
	 * @param id 集体id
	 * @param name 集体名称
	 * @param locate 住址(快递地址)
	 * @param ownerPhone 房东电话
	 * @param wifiName // wifi名称
	 * @param wifiPassword wifi密码
	 * @param createDate // 创建时间
	 */
	public Home(String id, String name, String locate, String ownerPhone,
			String wifiName, String wifiPassword, long createDate, ActiveType activeType) {
		super();
		this.id = id;
		this.name = name;
		this.locate = locate;
		this.ownerPhone = ownerPhone;
		this.wifiName = wifiName;
		this.wifiPassword = wifiPassword;
		this.createDate = createDate;
		this.active = ActiveType.getOrdinal(activeType);
	}

	public Byte getActive() {
		return active;
	}

	public String getLocate() {
		return locate;
	}

	public String getName() {
		return name;
	}

	public String getOwnerPhone() {
		return ownerPhone;
	}
	
	public String getWifiName() {
		return wifiName;
	}
	
	public String getWifiPassword() {
		return wifiPassword;
	}
	
	public void setActive(ActiveType activeType) {
		this.active = ActiveType.getOrdinal(activeType);
	}
	
	public void setActive(Byte active) {
		this.active = active;
	}
	public void setLocate(String locate) {
		this.locate = locate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOwnerPhone(String ownerPhone) {
		this.ownerPhone = ownerPhone;
	}
	
	public void setWifiName(String wifiName) {
		this.wifiName = wifiName;
	}
	
	public void setWifiPassword(String wifiPassword) {
		this.wifiPassword = wifiPassword;
	}

	@Override
	public String toString() {
		return "Home [name=" + name + ", locate=" + locate + ", ownerPhone="
				+ ownerPhone + ", wifiName=" + wifiName + ", wifiPassword="
				+ wifiPassword + ", active=" + active + "]";
	}
}

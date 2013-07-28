package com.chenlong.pc.entity;

import com.chenlong.pc.util.ActiveType;
import com.chenlong.pc.util.RoleType;

/**
 * 人员类
 * date:2013-7-5 22:49:20
 * @author chenlong
 *
 */
public class Person extends Entity{
	
	// 姓名
	private String name;
	
	// 登录名称
	private String loginName;
	
	// 登录密码
	private String loginPassword;
	
	// 角色 0 管理员, 1内部人员, 2来访人员
	private Byte role;
	
	// 状态  1活动, 0冻结
	private Byte active;
	
	// QQ
	private String qq;
	
	// 手机
	private String phone;
	
	// email邮箱
	private String email;
	
	// 生日年
	private Integer birthY;
	
	// 生日月
	private Integer birthMd;
	
	// 属于那个集体
	private String homeId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public Byte getRole() {
		return role;
	}

	public void setRole(RoleType roleType) {
		this.role = RoleType.getOrdinal(roleType);
	}
	
	public void setRole(Byte role) {
		this.role = role;
	}

	public Byte getActive() {
		return active;
	}

	public void setActive(ActiveType activeType) {
		this.active = ActiveType.getOrdinal(activeType);
	}

	public void setActive(Byte active) {
		this.active = active;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getBirthY() {
		return birthY;
	}

	public void setBirthY(Integer birthY) {
		this.birthY = birthY;
	}

	public Integer getBirthMd() {
		return birthMd;
	}

	public void setBirthMd(Integer birthMd) {
		this.birthMd = birthMd;
	}

	public String getHomeId() {
		return homeId;
	}

	public void setHomeId(String homeId) {
		this.homeId = homeId;
	}
	
	public Person() {}

	public Person(String id, String name, String loginName, String loginPassword,
			RoleType roleType, ActiveType activeType, String qq, String phone, String email,
			Integer birthY, Integer birthMd, String homeId, long createDate) {
		super();
		this.id = id;
		this.name = name;
		this.loginName = loginName;
		this.loginPassword = loginPassword;
		this.role = RoleType.getOrdinal(roleType);
		this.active = ActiveType.getOrdinal(activeType);
		this.qq = qq;
		this.phone = phone;
		this.email = email;
		this.birthY = birthY;
		this.birthMd = birthMd;
		this.homeId = homeId;
		this.createDate = createDate;
	}
	
}

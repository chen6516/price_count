package com.chenlong.pc.entity;

/**
 * 这一款项由那些人平摊
 * date:2013-7-5 22:51:33
 * @author chenlong
 *
 */
public class Purchaser extends Entity{
	
	// 账单id
	private String billId;
	
	// 那些人公摊
	private String personId;

	// 属于那个集体
	private String homeId;
	
	public Purchaser(){}

	public Purchaser(String id, String billId, String personId, 
			String homeId, long createDate) {
		super();
		this.id = id;
		this.billId = billId;
		this.personId = personId;
		this.homeId = homeId;
		this.createDate = createDate;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
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

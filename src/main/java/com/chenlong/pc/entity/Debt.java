package com.chenlong.pc.entity;

import java.math.BigDecimal;

import com.chenlong.pc.util.ActiveType;

/**
 * 欠款类, 记录欠款情况
 * @author chenlong
 * date: 2013-7-5 22:57:11
 *
 */
public class Debt extends Entity{
	
	// 是否失效
	private Byte active;
	// 欠款人
	private String debtPersionId;
	
	// 属于哪个集体
	private String homeId;
	
	// 债主
	private String personId;
	
	// 金额
	private BigDecimal sum;
	
	public Debt() {}

	public Debt(String id, String personId, String debtPersionId, String homeId,
			BigDecimal sum, ActiveType activeType, long createDate) {
		super();
		this.id = id;
		this.personId = personId;
		this.debtPersionId = debtPersionId;
		this.homeId = homeId;
		this.sum = sum;
		this.active = ActiveType.getOrdinal(activeType);
		this.createDate = createDate;
	}
	
	public Byte getActive() {
		return active;
	}

	public String getDebtPersionId() {
		return debtPersionId;
	}

	public String getHomeId() {
		return homeId;
	}

	public String getPersonId() {
		return personId;
	}

	public BigDecimal getSum() {
		return sum;
	}

	public void setActive(ActiveType activeType) {
		this.active = ActiveType.getOrdinal(activeType);
	}

	public void setActive(Byte active) {
		this.active = active;
	}

	public void setDebtPersionId(String debtPersionId) {
		this.debtPersionId = debtPersionId;
	}

	public void setHomeId(String homeId) {
		this.homeId = homeId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public void setSum(BigDecimal sum) {
		this.sum = sum;
	}
	
	@Override
	public String toString() {
		return "Debt [personId=" + personId + ", debtPersionId="
				+ debtPersionId + ", homeId=" + homeId + ", sum=" + sum
				+ ", active=" + active + "]";
	}
	
}

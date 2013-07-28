package com.chenlong.pc.entity;

import java.math.BigDecimal;

import com.chenlong.pc.util.ActiveType;
import com.chenlong.pc.util.ShareType;

/**
 * 是哪个人买的东西
 * date:2013-7-5 22:50:21
 * @author chenlong
 *
 */
public class Bill extends Entity{
	
	// 购买人
	private String personId;
	
	// 价格
	private BigDecimal price;
	
	// 是否有效,1有效, 0无效.
	private Byte active;
	
	// 分享类型, 0内部, 1公摊, 2私人
	private Byte shareType;
	
	// 备注
	private String remark;
	
	// 属于那个集体
	private String homeId;
	
	public Bill() {}
	
	public Bill(String id, String personId, BigDecimal price, ActiveType activeType,
			ShareType shareType, String remark, String homeId, long createDate) {
		super();
		this.id = id;
		this.personId = personId;
		this.price = price;
		this.active = ActiveType.getOrdinal(activeType);
		this.shareType = ShareType.getOrdinal(shareType);
		this.remark = remark;
		this.homeId = homeId;
		this.createDate = createDate;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
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

	public Byte getShareType() {
		return shareType;
	}

	public void setShareType(ShareType shareType) {
		this.shareType = ShareType.getOrdinal(shareType);
	}
	
	public void setShareType(Byte shareType) {
		this.shareType = shareType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Bill [personId=" + personId + ", price=" + price + ", active="
				+ active + ", shareType=" + shareType + ", remark=" + remark
				+ ", homeId=" + homeId + "]";
	}

	public String getHomeId() {
		return homeId;
	}

	public void setHomeId(String homeId) {
		this.homeId = homeId;
	}
}

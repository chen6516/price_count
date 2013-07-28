package com.chenlong.pc.entity;

/**
 * 物品类,用于记录买的商品的名称和种类,方便统计
 * @author chenlong
 *
 */
public class Item extends Entity{
	
	// 产品名称
	private String name;
	
	// 产品描述
	private String desc;
	
	// 父类id
	private String parentId;
	
	// 属于那个集体
	private String homeId;
		
	public String getHomeId() {
		return homeId;
	}

	public void setHomeId(String homeId) {
		this.homeId = homeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	
	/**
	 * 
	 * @param name 名称标识
	 * @param desc 名称
	 * @param parentId 父类id
	 * @param homeId 集体id
	 */
	public Item(String id, String name, String desc, String parentId, 
		 String homeId, long createDate) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.parentId = parentId;
		this.homeId = homeId;
		this.createDate = createDate;
	}
	
	public Item(){}

}

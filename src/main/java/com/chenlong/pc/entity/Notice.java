package com.chenlong.pc.entity;
/**
 * 公告类,公告一下消息
 * @author chenlong
 * date:2013-7-5 23:00:21
 */
public class Notice extends Entity{
	
	// 主题
	private String topic;
	
	// 内容
	private  String content;
	
	// 发布人
	private String personId;
	
	// 属于哪个集体
	private String homeId;
	
	public Notice() {}
	
	public Notice(String id, String topic, String content, 
			String personId, String homeId, long createDate) {
		super();
		this.id = id;
		this.topic = topic;
		this.content = content;
		this.personId = personId;
		this.homeId = homeId;
		this.createDate = createDate;
	}

	public String getContent() {
		return content;
	}

	public String getHomeId() {
		return homeId;
	}

	public String getPersonId() {
		return personId;
	}

	public String getTopic() {
		return topic;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setHomeId(String homeId) {
		this.homeId = homeId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	
}

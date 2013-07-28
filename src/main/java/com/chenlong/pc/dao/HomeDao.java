package com.chenlong.pc.dao;

import java.util.List;
import java.util.Map;

import com.chenlong.pc.dao.base.BaseDao;
import com.chenlong.pc.entity.Home;

public interface HomeDao{
	
	public List<Home> findAll();
	
	public Home findById(String id);
	
	public int countAll();
	
	public void delete(String id);
	
	public void save(Home obj);
	
	public void update(Home obj);
	
	public List<Home> findTop(Map<String, Object> params);
}

package com.chenlong.pc.dao.base;

import java.util.List;
import java.util.Map;

import com.chenlong.pc.entity.Entity;

public interface BaseDao<T extends Entity> {
	
	/*public List<T> findAll(String homeId);
	
	public T findById(String id);
	
	public List<T> findTop(Map<String, Object> params);
	
	public int countAll(String homeId);
	
	public void delete(String id);
	
	public void save(T obj);
	
	public void update(T obj);*/
	
	public List<T> findAll(Map<String, Object> params);
	
	public T findById(Map<String, Object> params);
	
	public List<T> findTop(Map<String, Object> params);
	
	public int countAll(Map<String, Object> params);
	
	public void delete(Map<String, Object> params);
	
	public void save(Map<String, Object> params);
	
	public void update(Map<String, Object> params);
}

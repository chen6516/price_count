package com.chenlong.pc.service;

import java.util.List;
import java.util.Map;

import com.chenlong.pc.entity.Entity;
import com.chenlong.pc.entity.Log;

public interface BaseService<T extends Entity> {
/*	public List<T> findAll(String homeId);
	
	public T findById(String id);
	
	public List<T> findTop(int from, int limit, String homeId);
	
	public int countAll(String homeId);
	
	public void delete(String id, Log log);
	
	public void save(T obj, Log log);
	
	public void update(T obj, Log log);*/
	
	public List<T> findAll(Map<String, Object> params);
	
	public T findById(Map<String, Object> params);
	
	public List<T> findTop(Map<String, Object> params);
	
	public int countAll(Map<String, Object> params);
	
	public void delete(Map<String, Object> params);
	
	public void save(Map<String, Object> params);
	
	public void update(Map<String, Object> params);
}

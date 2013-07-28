package com.chenlong.pc.service;

import java.util.List;

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
	
	public List<T> findAll();
	
	public T findById(String id);
	
	public List<T> findTop(int from, int limit, String homeId);
	
	public int countAll(String homeId);
	
	public void delete(String id, Log log);
	
	public void save(T obj, Log log);
	
	public void update(T obj, Log log);
}

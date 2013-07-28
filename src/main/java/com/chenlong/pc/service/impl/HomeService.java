package com.chenlong.pc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenlong.pc.dao.HomeDao;
import com.chenlong.pc.dao.LogDao;
import com.chenlong.pc.entity.Home;
import com.chenlong.pc.entity.Log;
import com.chenlong.pc.service.BaseService;

@Service
public class HomeService {

	private HomeDao homeDao;
	
	private LogDao logDao;
	
	@Autowired
	public void setHomeDao(HomeDao homeDao) {
		this.homeDao = homeDao;
	}
	
	@Autowired
	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}

	public List<Home> findAll() {
		return homeDao.findAll();
	}

	
	public Home findById(String id) {
		return homeDao.findById(id);
	}

	
	public List<Home> findTop(int from, int size) {
		Map<String, Object> limit = new HashMap<String, Object>();
		limit.put("from", from);
		limit.put("size", size);
		return homeDao.findTop(limit);
	}

	
	public int countAll() {
		return homeDao.countAll();
	}

	public void delete(String id, Log log) {
		homeDao.delete(id);
		logDao.save(log);
	}

	public void save(Home obj, Log log) {
		homeDao.save(obj);
		logDao.save(log);
	}

	public void update(Home obj, Log log) {
		homeDao.update(obj);
		logDao.save(log);
	}
	
}

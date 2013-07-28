package com.chenlong.pc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenlong.pc.dao.DebtDao;
import com.chenlong.pc.dao.LogDao;
import com.chenlong.pc.entity.Debt;
import com.chenlong.pc.entity.Log;
import com.chenlong.pc.service.BaseService;

@Service
public class DebtService implements BaseService<Debt> {

	private DebtDao debtDao;
	
	private LogDao logDao;
	
	@Autowired
	public void setDebtDao(DebtDao debtDao) {
		this.debtDao = debtDao;
	}
	
	@Autowired
	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}

	@Override
	public List<Debt> findAll(String homeId) {
		return debtDao.findAll(homeId);
	}

	@Override
	public Debt findById(String id) {
		return debtDao.findById(id);
	}

	@Override
	public List<Debt> findTop(int from, int size, String homeId) {
		Map<String, Object> limit = new HashMap<String, Object>();
		limit.put("from", from);
		limit.put("size", size);
		limit.put("homeId", homeId);
		return debtDao.findTop(limit);
	}

	@Override
	public int countAll(String homeId) {
		return debtDao.countAll(homeId);
	}

	@Override
	public void delete(String id, Log log) {
		debtDao.delete(id);
		logDao.save(log);
	}

	@Override
	public void save(Debt obj, Log log) {
		debtDao.save(obj);
		logDao.save(log);
	}

	@Override
	public void update(Debt obj, Log log) {
		debtDao.update(obj);
		logDao.save(log);
	}
	
}

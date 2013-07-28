package com.chenlong.pc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chenlong.pc.dao.BillDao;
import com.chenlong.pc.dao.LogDao;
import com.chenlong.pc.entity.Bill;
import com.chenlong.pc.entity.Log;
import com.chenlong.pc.service.BaseService;

@Service
public class BillService implements BaseService<Bill> {

	private BillDao billDao;
	
	private LogDao logDao;
	
	@Autowired
	public void setBillDao(BillDao billDao) {
		this.billDao = billDao;
	}
	
	@Autowired
	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}

	@Override
	public List<Bill> findAll(String homeId) {
		return billDao.findAll(homeId);
	}

	@Override
	public Bill findById(String id) {
		return billDao.findById(id);
	}

	@Override
	public List<Bill> findTop(int from, int size, String homeId) {
		Map<String, Object> limit = new HashMap<String, Object>();
		limit.put("from", from);
		limit.put("size", size);
		limit.put("homeId", homeId);
		return billDao.findTop(limit);
	}

	@Override
	public int countAll(String homeId) {
		return billDao.countAll(homeId);
	}

	@Override
	public void delete(String id, Log log) {
		billDao.delete(id);
		logDao.save(log);
	}

	@Override
	public void save(Bill obj, Log log) {
		billDao.save(obj);
		logDao.save(log);
	}

	@Override
	public void update(Bill obj, Log log) {
		billDao.update(obj);
		logDao.save(log);
	}
	
}

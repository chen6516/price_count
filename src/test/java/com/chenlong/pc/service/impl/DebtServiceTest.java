package com.chenlong.pc.service.impl;

import static com.chenlong.pc.util.UUIDCreator.getUuId;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chenlong.pc.entity.Debt;
import com.chenlong.pc.entity.Log;
import com.chenlong.pc.util.ActiveType;
import com.chenlong.pc.util.OperateType;

public class DebtServiceTest {
	
	private static ApplicationContext context;
	
	private Debt debt;
	
	private static DebtService debtService;
	
	@BeforeClass
	public static void init(){
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Before
	public void setUp(){
		debtService = (DebtService)context.getBean("debtService");
	}
	
	//@Test
	public void testSave(){
		debt = new Debt(getUuId(), getUuId(), getUuId(), getUuId(), 
				new BigDecimal("128.5"), ActiveType.ACTIVE, Calendar.getInstance().getTimeInMillis());
		Log log = new Log(getUuId(), OperateType.DEBT_ADD, 
				getUuId(), debt.getHomeId(), debt.getCreateDate());
		debtService.save(debt, log);
	}
	
	//@Test
	public void testCountAll(){
		System.out.println(debtService.countAll("e2dc858d10054c4c8f58e4169fdb59db"));
	}
	
	//@Test
	public void testFindAll(){
		List<Debt> lb = debtService.findAll("e2dc858d10054c4c8f58e4169fdb59db");
		for (Debt debt : lb) {
			System.out.println(debt);
		}
	}
	
	//@Test
	public void testFindById(){
		debt = debtService.findById("7bd529513d5b4ad7b7f4c040ad2abf5d");
		System.out.println(debt);
	}
	
	//@Test
	public void testFindTop(){
		List<Debt> lb = debtService.findTop(0, 2, "e2dc858d10054c4c8f58e4169fdb59db");
		for (Debt debt : lb) {
			System.out.println(debt);
		}
	}
	
	//@Test
	public void testUpdate(){
		debt = new Debt();
		debt.setId("7bd529513d5b4ad7b7f4c040ad2abf5d");
		debt.setSum(new BigDecimal("5.8"));
		debt.setActive(ActiveType.FADE);
		Log log = new Log(getUuId(), OperateType.DEBT_DELETE, 
				getUuId(), getUuId(), Calendar.getInstance().getTimeInMillis());
		debtService.update(debt, log);
	}
	
	//@Test
	public void testDelete(){
		Log log = new Log(getUuId(), OperateType.DEBT_DELETE, 
				getUuId(), getUuId(), Calendar.getInstance().getTimeInMillis());
		debtService.delete("7bd529513d5b4ad7b7f4c040ad2abf5d", log);
	}
	
	@AfterClass
	public static void destroy(){
	}
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		debtService = (DebtService)context.getBean("debtService");
	}
}

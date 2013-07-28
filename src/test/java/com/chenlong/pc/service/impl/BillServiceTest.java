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

import com.chenlong.pc.entity.Bill;
import com.chenlong.pc.entity.Log;
import com.chenlong.pc.util.ActiveType;
import com.chenlong.pc.util.OperateType;
import com.chenlong.pc.util.ShareType;

public class BillServiceTest {
	
	private static ApplicationContext context;
	
	private Bill bill;
	
	private static BillService billService;
	
	@BeforeClass
	public static void init(){
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Before
	public void setUp(){
		billService = (BillService)context.getBean("billService");
	}
	
	//@Test
	public void testSave(){
		
		bill = new Bill(getUuId(), getUuId(), new BigDecimal("11.8"), ActiveType.ACTIVE, 
				ShareType.PRIVATE_ONESELF, "123", getUuId(), Calendar.getInstance().getTimeInMillis());
		Log log = new Log(getUuId(), OperateType.BILL_ADD, 
				getUuId(), bill.getHomeId(), bill.getCreateDate());
		billService.save(bill, log);
	}
	
	//@Test
	public void testCountAll(){
		System.out.println(billService.countAll("8b98a0356fc6477390484986f65e35a3"));
	}
	
	//@Test
	public void testFindAll(){
		List<Bill> lb = billService.findAll("8b98a0356fc6477390484986f65e35a3");
		for (Bill bill : lb) {
			System.out.println(bill);
		}
	}
	//@Test
	public void testFindById(){
		bill = billService.findById("31474d0019274efe9983315459d1c2b5");
		System.out.println(bill);
	}
	
	//@Test
	public void testFindTop(){
		List<Bill> lb = billService.findTop(0, 2, "8b98a0356fc6477390484986f65e35a3");
		for (Bill bill : lb) {
			System.out.println(bill);
		}
	}
	
	@Test
	public void testUpdate(){
		bill = new Bill();
		bill.setId("31474d0019274efe9983315459d1c2b5");
		bill.setPrice(new BigDecimal("25.8"));
		bill.setActive(ActiveType.ACTIVE);
		Log log = new Log(getUuId(), OperateType.BILL_DELETE, 
				getUuId(), getUuId(), Calendar.getInstance().getTimeInMillis());
		billService.update(bill, log);
	}
	
	//@Test
	public void testDelete(){
		Log log = new Log(getUuId(), OperateType.BILL_DELETE, 
				getUuId(), getUuId(), Calendar.getInstance().getTimeInMillis());
		billService.delete("fa60e630af6440a384651e7aa02ad40f", log);
	}
	
	@AfterClass
	public static void destroy(){
	}
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		billService = (BillService)context.getBean("billService");
		List<Bill> lb = billService.findAll("8b98a0356fc6477390484986f65e35a3");
	}
}

package com.chenlong.pc.service.impl;

import static com.chenlong.pc.util.UUIDCreator.getUuId;

import java.util.Calendar;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chenlong.pc.entity.Home;
import com.chenlong.pc.entity.Log;
import com.chenlong.pc.util.ActiveType;
import com.chenlong.pc.util.OperateType;

public class HomeServiceTest {
	
	private static ApplicationContext context;
	
	private Home home;
	
	private static HomeService homeService;
	
	@BeforeClass
	public static void init(){
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Before
	public void setUp(){
		homeService = (HomeService)context.getBean("homeService");
	}
	
	@Test
	public void testSave(){
		home = new Home(getUuId(), "402", "姐儿燕", "1355674654", "402",
				"123456", Calendar.getInstance().getTimeInMillis(), ActiveType.ACTIVE);
		Log log = new Log(getUuId(), OperateType.HOME_ADD, 
				getUuId(), home.getId(), home.getCreateDate());
		homeService.save(home, log);
	}
	
	//@Test
	public void testCountAll(){
		System.out.println(homeService.countAll());
	}
	
	//@Test
	public void testFindAll(){
		List<Home> lb = homeService.findAll();
		for (Home home : lb) {
			System.out.println(home);
		}
	}
	
	//@Test
	public void testFindById(){
		home = homeService.findById("2f842dd0081f4b2fbdfa04b84ac4eebe");
		System.out.println(home);
	}
	
	//@Test
	public void testFindTop(){
		List<Home> lb = homeService.findTop(0, 2);
		for (Home home : lb) {
			System.out.println(home);
		}
	}
	
	//@Test
	public void testUpdate(){
		home = new Home();
		home.setId("7bd529513d5b4ad7b7f4c040ad2abf5d");
		home.setActive(ActiveType.FADE);
		Log log = new Log(getUuId(), OperateType.DEBT_DELETE, 
				getUuId(), getUuId(), Calendar.getInstance().getTimeInMillis());
		homeService.update(home, log);
	}
	
	//@Test
	public void testDelete(){
		Log log = new Log(getUuId(), OperateType.DEBT_DELETE, 
				getUuId(), getUuId(), Calendar.getInstance().getTimeInMillis());
		homeService.delete("7bd529513d5b4ad7b7f4c040ad2abf5d", log);
	}
	
	@AfterClass
	public static void destroy(){
	}
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		homeService = (HomeService)context.getBean("homeService");
	}
}

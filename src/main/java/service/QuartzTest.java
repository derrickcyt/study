package service;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class QuartzTest {

	public QuartzTest(){
		System.out.println("quartz test start!");
	}
	
	public void print(){
		Date date=new Date(System.currentTimeMillis());
		System.out.println(date.toString()+"quartz test!");
	}
}

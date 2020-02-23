package com.wts.math;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wts.math.service.CalulateService;
import com.wts.pojo.Math;

public class ConsumerStart {

	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		
		CalulateService calulateService = context.getBean(CalulateService.class);
		
		int add = calulateService.add(5, 5);
		System.out.println("加法结果是"+add);
		
		int multiply = calulateService.multiply(4, 5);
		System.out.println("乘法结果是"+multiply);
	}
}

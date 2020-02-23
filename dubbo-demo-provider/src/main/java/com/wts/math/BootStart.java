package com.wts.math;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStart {

public static void main(String[] args) throws Exception {
	// 加载服务的容器
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	context.start();
	
	// 加载服务到容器
	System.in.read();
	}
}

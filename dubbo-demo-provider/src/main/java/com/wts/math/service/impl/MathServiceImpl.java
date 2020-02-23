package com.wts.math.service.impl;

import com.wts.math.service.CalulateService;
import com.wts.pojo.Math;

public class MathServiceImpl implements CalulateService{

	public int add(int a, int b) {
		// TODO Auto-generated method stub
		Math math = new Math();
		math.setA(a);
		math.setB(b);
		Integer c = (a+b);
		System.out.println("a + b ="+c);
		return c;
	}

	public int multiply(int a, int b) {
		Math math = new Math();
		math.setA(a);
		math.setB(b);
		Integer c = (a*b);
		System.out.println("a * b ="+c);
		return c;
	}

}

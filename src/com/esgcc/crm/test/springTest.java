package com.esgcc.crm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest {
	public static void main(String[] args) {
		ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
		Object bean = ioc.getBean("user");
		System.out.print(bean);
	}
}

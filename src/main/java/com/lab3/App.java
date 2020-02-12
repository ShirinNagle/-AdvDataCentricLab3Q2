package com.lab3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
	
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/lab3/beans/beans.xml");
		Car c = (Car) context.getBean("2000-G-456");
		
		Car c1 = (Car) context.getBean("2017-G-1");
		System.out.println(c);
		System.out.println(c1);


	}

}

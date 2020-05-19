package com.example.demo;

import com.example.demo.beans.Sim;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
		Sim sim=context.getBean("sim",Sim.class);
		sim.Calling();
		sim.Messaging();
	}
}

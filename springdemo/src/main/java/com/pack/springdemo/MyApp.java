package com.pack.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Roles.xml");
		
		//Only one object is created internally (Same single object but 3 refs) ---SINGLETON DESIGN PATTERN--(MAINLY USEFUL IN DB CONNECTIONS)
		Manager obj1 = (Manager) ctx.getBean("mgr"); //if you use Object obj then no need of typecasting
		Manager obj2 = (Manager) ctx.getBean("mgr"); 
		Manager obj3 = (Manager) ctx.getBean("mgr"); 
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		obj1.setName("Manoj");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		//FOR CREATING DIFFERENT OBJECTS CHANGING THE SCOPE IN XML FILE TO 'PROTYPE'.
		obj2.setName("Prabhakar");
		obj3.setName("Harsha");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		obj2=null;
		System.gc(); //Manually calling GC it will remove null objects
	}

}

package com.pack.springdemo;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
@SuppressWarnings("deprecation")
public class App 
{
    public static void main( String[] args )
    {
//        	System.out.println( "Hello World!" );
//    		Human obj = new Woman(); //if you want to change the object to Man 
//    	   	System.out.println(obj);
    		
// WAY 1
//    		Resource res = new ClassPathResource("Beans.xml");
//    		BeanFactory factory = new XmlBeanFactory(res);
//WAY 2
//    		ApplicationContext factory = new ClassPathXmlApplicationContext("Beans.xml");
    		
    		BeanFactory factory = new ClassPathXmlApplicationContext("Beans.xml");
    		Scanner sc = new Scanner(System.in);	
    		System.out.println("------------------");
    		System.out.println("1. MAN");
    		System.out.println("2. WOMAN");
    		System.out.println("3. Address");//give either m_addr or w_addr
    		System.out.println("------------------");
    		System.out.println("Enter choice :");
    		String op = sc.next();
    		if(op.equals("man")||op.equals("woman")) {
    			Human obj = (Human)factory.getBean(op);
    			System.out.println(obj);
    		}
    		else{
    			Address addr = (Address)factory.getBean(op); 
    			System.out.println(addr);
    		}
    		sc.close();
    }
}

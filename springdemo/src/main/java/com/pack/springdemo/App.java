package com.pack.springdemo;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
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
    		Resource res = new ClassPathResource("Beans.xml");
    		BeanFactory factory = new XmlBeanFactory(res);
    		Scanner sc = new Scanner(System.in);
    		System.out.println("------------------");
    		System.out.println("1. MAN");
    		System.out.println("2. WOMAN");
    		System.out.println("------------------");
    		System.out.println("Enter choice :");
    		String op = sc.next();
    		Human obj = (Human)factory.getBean(op);
    		System.out.println(obj);
    }
}

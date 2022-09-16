package org.genspark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App
{
    public static void main( String[] args ){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Student s = (Student) context.getBean("Student");
        System.out.println(s);

    }
}

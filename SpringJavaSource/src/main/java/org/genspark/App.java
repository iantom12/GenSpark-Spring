package org.genspark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student s = (Student)context.getBean("Student1");
        Student s2= (Student)context.getBean("Student2");
        System.out.println("Student1: "+ s);
        System.out.println( "Student2: "+ s2);
    }
}

package org.practice;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Dev obj = context.getBean(Dev.class);
//        Setter injection
//        obj.setAge(20);
//        System.out.println(obj.getAge());
        obj.build();

    }
}

package com.in28minutes.learnspringframework;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {

        //1. launch a Spring context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        //2. configure the things we want Spring to manage - do this with config class
        //HelloWorldConfig is the config class - @Configuration
        //name is a bean managed by context - @Bean

        //3. Retrieve Beans managed by Spring

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2"));
        System.out.println(context.getBean("address2"));


    }
}

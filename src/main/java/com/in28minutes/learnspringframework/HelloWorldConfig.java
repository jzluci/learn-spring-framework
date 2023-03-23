package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address){};
record Address(String street, String city){};

@Configuration
public class HelloWorldConfig {

    @Bean
    public String name(){
        return "Zach";
    }

    @Bean
    public int age(){
        return 22;
    }

    @Bean
    public Person person(){
        return new Person("Maddie" , 21, new Address("1234 Main Street", "Metropolis"));

    }

    @Bean
    public Person person2(){
        return new Person(name() , age(), address());

    }

    @Bean (name = "address2")
    public Address address(){
        return new Address("1234 Main Street", "Metropolis");
    }

}

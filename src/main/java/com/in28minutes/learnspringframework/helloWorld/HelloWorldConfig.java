package com.in28minutes.learnspringframework.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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

    @Bean
    public Person person3(String name, int age, Address address3){
        return new Person(name,age,address3);
    }
    @Bean
    @Primary
    public Person person4(String name, int age, Address address){
        return new Person(name,age,address);
    }

    @Bean
    public Person person5(String name, int age, @Qualifier("address3qualifier") Address address){
        return new Person(name,age,address);
    }

    @Bean (name = "address2")
    @Primary
    public Address address(){
        return new Address("1234 Main Street", "Metropolis");
    }


    @Bean (name = "address3")
    @Qualifier("address3qualifier")
    public Address address3(){
        return new Address("1234 Second Street", "Metropolis");
    }

}

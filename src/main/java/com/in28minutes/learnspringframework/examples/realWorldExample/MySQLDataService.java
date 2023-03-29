package com.in28minutes.learnspringframework.examples.realWorldExample;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class MySQLDataService implements DataService{

    public int[] retrieveData(){
        return new int[]{1,2,3,4,5};
    }

}

package com.in28minutes.learnspringframework.examples.realWorldExample;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService {

    private DataService dataService;

    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }

    public BusinessCalculationService(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public DataService getDataService() {
        return dataService;
    }

    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }

    @Override
    public String toString() {
        return "BusinessCalculationService{" +
                "dataService=" + dataService +
                '}';
    }
}

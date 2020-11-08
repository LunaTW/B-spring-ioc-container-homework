package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

//@Service
@Scope(SCOPE_PROTOTYPE)
public class GreetingService {

    public GreetingService() {
        System.out.println("--------- Service ---------");
    }

    String sayHi() {
        return "hello world";
    }
}

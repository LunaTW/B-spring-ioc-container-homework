package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;
import static org.springframework.context.annotation.ScopedProxyMode.TARGET_CLASS;

@Service
@Scope(value = SCOPE_PROTOTYPE,proxyMode = TARGET_CLASS)
public class GreetingService {

    public GreetingService() {
        System.out.println("--------- Service ---------");
    }

    String sayHi() {
        return "hello world";
    }
}

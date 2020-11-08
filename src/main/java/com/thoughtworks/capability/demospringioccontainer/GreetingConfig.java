package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Configuration
public class GreetingConfig {

    @Bean
    @Scope(value=SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
    public GreetingService greeterService() {
        return new GreetingService();
    }
}

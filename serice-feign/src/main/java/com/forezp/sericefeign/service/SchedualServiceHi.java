package com.forezp.sericefeign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHi implements HelloFeign {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}

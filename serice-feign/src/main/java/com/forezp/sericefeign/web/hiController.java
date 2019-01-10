package com.forezp.sericefeign.web;

import com.forezp.sericefeign.service.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hiController {
    @Autowired
    HelloFeign helloFeign;

    @RequestMapping("/hi")
    public String sayFeign(@RequestParam String name) {
        return helloFeign.sayHiFromClientOne(name);
    }
}

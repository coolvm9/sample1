package com.gke.sample1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleServiceController {

    @GetMapping("/service1")
    public String service1() {
        return "Service 1";
    }
    @GetMapping("/service2")
    public String service2() {
        return "Service 2";
    }
}

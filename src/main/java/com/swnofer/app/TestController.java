package com.swnofer.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/test")

public class TestController {
    private final ApplicationConfig appConfig;

    public TestController(ApplicationConfig appConfig) {
        this.appConfig = appConfig;
    }

    @GetMapping
    public String getAppConfig(){
//        System.out.println(appConfig.sabrePassword);
        return "appConfig";
    }
}

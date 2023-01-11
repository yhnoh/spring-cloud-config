package com.example.configclient;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EnvironmentController {

    private final Environment environment;
    @GetMapping("/environment")
    public String environment(){

        return environment.getProperty("active");
    }
}

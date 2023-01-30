package com.apps.microservice.fetchuserservice;

import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/api")
@RefreshScope
public class FetchUserController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${users.url}")
    private String usersUrl;

    @GetMapping(value = "/users")
    @Retry(name = "fetch-users", fallbackMethod = "defaultMethod")
    public String fetchAllUser() {
        return restTemplate.getForObject(usersUrl, String.class);
    }

    public String defaultMethod(Exception exception) {
        return "API is currently not working !!";
    }
}

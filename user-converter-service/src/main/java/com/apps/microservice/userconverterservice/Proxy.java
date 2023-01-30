package com.apps.microservice.userconverterservice;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(name="fetch-user-service")
public interface Proxy {
    @GetMapping("/api/users")
    public String retrieveExchangeValue();
}

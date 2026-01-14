package com.ticketsystem.controller.resource;

import com.ticketsystem.application.service.event.EventAppService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/haha")
public class HiController {


    @Autowired
    private EventAppService eventAppService;


    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/hi")
    @RateLimiter(name = "ticketService", fallbackMethod = "fallbackSayHi")
    public String sayHi() {
        return eventAppService.sayHi();
    }

    public String fallbackSayHi(Throwable t) {
        return "Too many requests";
    }

    @GetMapping("/ho")
    public String sayHo() {
        return eventAppService.sayHi();
    }


    @GetMapping("/circuit")
    @CircuitBreaker(name = "circuitBreakerService", fallbackMethod = "fallbackCircuitBreaker")
    public String circuitBreakerTest() {
        //create a resttemplate call to fakestoreapi.com/products/1.
        return restTemplate.getForObject("https://fakestoreapi.com/products/1", String.class);
    }

    public String fallbackCircuitBreaker(Throwable t) {
        return "Circuit breaker fallback response";
    }
}

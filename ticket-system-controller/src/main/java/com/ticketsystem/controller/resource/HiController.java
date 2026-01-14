package com.ticketsystem.controller.resource;

import com.ticketsystem.application.service.event.EventAppService;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/haha")
public class HiController {


    @Autowired
    private EventAppService eventAppService;


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

}

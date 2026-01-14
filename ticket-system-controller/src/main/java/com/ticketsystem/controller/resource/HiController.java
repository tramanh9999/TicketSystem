package com.ticketsystem.controller.resource;

import com.ticketsystem.application.service.event.EventAppService;
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
    public String sayHi() {
        return eventAppService.sayHi();
    }

    @GetMapping("/ho")
    public String sayHo() {
        return eventAppService.sayHi();
    }

}

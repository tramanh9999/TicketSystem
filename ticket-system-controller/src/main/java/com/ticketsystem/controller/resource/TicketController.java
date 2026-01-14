package com.ticketsystem.controller.resource;

import com.ticketsystem.application.service.event.EventAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tickets")
public class TicketController {


    @Autowired
    private EventAppService eventAppService;


    @GetMapping
    public String getTickets() {
        return eventAppService.sayHi();
    }
}

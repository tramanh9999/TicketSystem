package com.ticketsystem.application.service.event.impl;

import com.ticketsystem.application.service.event.EventAppService;
import com.ticketsystem.domain.service.HiDomainService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventAppServiceImpl implements EventAppService {


    @Autowired
    private HiDomainService hiDomainService;


    @Override
    public String sayHi() {
        return hiDomainService.sayHi();
    }
}

package com.ticketsystem.domain.service.impl;

import com.ticketsystem.domain.repository.HiDomainRepository;
import com.ticketsystem.domain.service.HiDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HiDomainServiceImpl implements HiDomainService {


    @Autowired
    private HiDomainRepository hiDomainRepository;

    @Override
    public String sayHi() {
        return hiDomainRepository.sayHi();
    }
}

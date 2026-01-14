package com.ticketsystem.infrastructure.persistence.repository;

import com.ticketsystem.domain.repository.HiDomainRepository;
import org.springframework.stereotype.Service;

@Service
public class HiInfraDomainRepositoryImpl implements HiDomainRepository {
    @Override
    public String sayHi() {
        return "Hi from Infrastructure Repository";
    }
}

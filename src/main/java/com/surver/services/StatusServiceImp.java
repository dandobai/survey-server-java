package com.surver.services;

import com.surver.repositories.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusServiceImp implements StatusService{
    private final StatusRepository statusRepository;

    @Autowired
    public StatusServiceImp(StatusRepository statusRepository){
        this.statusRepository = statusRepository;
    }
}

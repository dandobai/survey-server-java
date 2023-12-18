package com.surver.controllers;

import com.surver.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    private final StatusService statusService;

    @Autowired
    public StatusController(StatusService statusService){
        this.statusService = statusService;
    }
}

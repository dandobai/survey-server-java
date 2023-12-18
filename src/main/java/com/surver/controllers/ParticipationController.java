package com.surver.controllers;

import com.surver.services.ParticipationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParticipationController {
    private final ParticipationService participationService;

    @Autowired
    public ParticipationController(ParticipationService participationService){
        this.participationService = participationService;
    }
}

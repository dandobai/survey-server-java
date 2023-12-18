package com.surver.controllers;

import com.surver.repositories.ParticipationRepository;
import com.surver.repositories.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParticipationController {
    private final ParticipationRepository participationRepository;

    @Autowired
    public ParticipationController(ParticipationRepository participationRepository){
        this.participationRepository = participationRepository;
    }
}

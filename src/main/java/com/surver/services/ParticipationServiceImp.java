package com.surver.services;

import com.surver.repositories.ParticipationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipationServiceImp implements ParticipationService {
    private final ParticipationRepository participationRepository;

    @Autowired
    public ParticipationServiceImp(ParticipationRepository participationRepository){
        this.participationRepository = participationRepository;
    }
}

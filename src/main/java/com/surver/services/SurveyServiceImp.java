package com.surver.services;

import com.surver.repositories.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyServiceImp implements SurveyService{
    private final SurveyRepository surveyRepository;

    @Autowired
    public SurveyServiceImp(SurveyRepository surveyRepository){
        this.surveyRepository = surveyRepository;
    }
}

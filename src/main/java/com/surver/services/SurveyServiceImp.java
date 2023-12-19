package com.surver.services;

import com.surver.dtos.delete.DeleteDTO;
import com.surver.dtos.survey.ListOfSurveyDTO;
import com.surver.dtos.survey.SurveyDTO;
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

    @Override
    public ListOfSurveyDTO getListOfSurvey() {
        return null;
    }

    @Override
    public SurveyDTO getSurveyById(String id) {
        return null;
    }

    @Override
    public SurveyDTO createSurveyBySurveyDTO(SurveyDTO surveyDTO) {
        return null;
    }

    @Override
    public SurveyDTO updateSurveyBySurveyDTO(SurveyDTO surveyDTO) {
        return null;
    }

    @Override
    public DeleteDTO deletesurveyBysurveyDTO(SurveyDTO surveyDTO) {
        return null;
    }
    @Override
    public DeleteDTO deletesurveyByID(String id) {
        return null;
    }
}

package com.surver.services;

import com.surver.dtos.delete.DeleteDTO;
import com.surver.dtos.survey.ListOfSurveyDTO;
import com.surver.dtos.survey.SurveyDTO;

public interface SurveyService {
    ListOfSurveyDTO getListOfSurvey();
    SurveyDTO getSurveyById(String id);
    SurveyDTO createSurveyBySurveyDTO(SurveyDTO surveyDTO);
    SurveyDTO updateSurveyBySurveyDTO(SurveyDTO surveyDTO);
    DeleteDTO deletesurveyBysurveyDTO(SurveyDTO surveyDTO);

    DeleteDTO deletesurveyByID(String id);
}

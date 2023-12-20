package com.surver.services;

import com.surver.dtos.delete.DeleteDTO;
import com.surver.dtos.participation.ListOfParticipationsDTO;
import com.surver.dtos.participation.ParticipationDTO;
import com.surver.dtos.survey.ListOfSurveyDTO;
import com.surver.dtos.survey.SurveyDTO;
import com.surver.enums.Deleted;
import com.surver.models.Participation;
import com.surver.models.Survey;
import com.surver.repositories.SurveyRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SurveyServiceImp implements SurveyService{
    private final SurveyRepository surveyRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public SurveyServiceImp(SurveyRepository surveyRepository,
                            ModelMapper modelMapper){
        this.surveyRepository = surveyRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ListOfSurveyDTO getListOfSurvey() {
        return modelMapper.map(surveyRepository.findAll(), ListOfSurveyDTO.class);
    }

    @Override
    public SurveyDTO getSurveyById(Long id) {
        Optional<Survey> survey = surveyRepository.findById(id);
        return modelMapper.map(survey, SurveyDTO.class);
    }

    @Override
    public SurveyDTO createSurveyBySurveyDTO(SurveyDTO surveyDTO) {
        Survey survey = modelMapper.map(surveyDTO, Survey.class);
        surveyRepository.save(survey);
        return modelMapper.map(survey,SurveyDTO.class);
    }

    @Override
    public SurveyDTO updateSurveyBySurveyDTO(SurveyDTO surveyDTO) {
        Survey survey = modelMapper.map(surveyDTO,Survey.class);
        surveyRepository.save(survey);
        return modelMapper.map(survey,SurveyDTO.class);
    }

    @Override
    public DeleteDTO deletesurveyBysurveyDTO(SurveyDTO surveyDTO) {
        Survey survey = modelMapper.map(surveyDTO,Survey.class);
        surveyRepository.delete(survey);
        return new DeleteDTO(survey.getId(), Deleted.YES);
    }
    @Override
    public DeleteDTO deletesurveyByID(Long id) {
        surveyRepository.deleteById(id);
        return new DeleteDTO(id, Deleted.YES);
    }
}

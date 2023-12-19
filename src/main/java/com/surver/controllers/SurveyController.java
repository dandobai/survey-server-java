package com.surver.controllers;

import com.surver.dtos.delete.DeleteDTO;
import com.surver.dtos.survey.*;
import com.surver.services.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SurveyController {
    private final SurveyService surveyService;

    @Autowired
    public SurveyController(SurveyService surveyService){
        this.surveyService = surveyService;
    }
    @GetMapping("/survey")
    public ResponseEntity<ListOfSurveyDTO> getListOfSurveyDTO() {
        return ResponseEntity.ok(surveyService.getListOfSurvey());
    }
    @GetMapping("/survey/{id}")
    public ResponseEntity<SurveyDTO> getSurveyDTO(@PathVariable String id) {
        return ResponseEntity.ok(surveyService.getSurveyById(id));
    }
    @PostMapping("/addsurvey")
    public ResponseEntity<SurveyDTO> createSurvey(SurveyDTO surveyDTO) {
        return ResponseEntity.ok(surveyService.createSurveyBySurveyDTO(surveyDTO));
    }
    @PutMapping("/updatesurvey")
    public ResponseEntity<SurveyDTO> updatesurvey(SurveyDTO surveyDTO) {
        return ResponseEntity.ok(surveyService.updateSurveyBySurveyDTO(surveyDTO));
    }
    @DeleteMapping("/deletesurvey")
    public ResponseEntity<DeleteDTO> deletesurvey(SurveyDTO surveyDTO) {
        return ResponseEntity.ok(surveyService.deletesurveyBysurveyDTO(surveyDTO));
    }
    @DeleteMapping("/deletesurvey/{id}")
    public ResponseEntity<DeleteDTO> deletesurveybyid(@PathVariable String id) {
        return ResponseEntity.ok(surveyService.deletesurveyByID(id));
    }
}

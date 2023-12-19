package com.surver.dtos.survey;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class ListOfSurveyDTO {
    List<SurveyDTO> surveyDTOs;

    public ListOfSurveyDTO(List<SurveyDTO> surveyDTOs) {
        this.surveyDTOs = surveyDTOs;
    }
}

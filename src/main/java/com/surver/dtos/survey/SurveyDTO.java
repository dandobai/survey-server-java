package com.surver.dtos.survey;

import com.surver.enums.Deleted;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
public class SurveyDTO {
    SurveyDTO surveyDTO;

    public SurveyDTO(SurveyDTO surveyDTO) {
        this.surveyDTO = surveyDTO;
    }
}

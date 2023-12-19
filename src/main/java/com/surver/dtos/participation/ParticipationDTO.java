package com.surver.dtos.participation;

import com.surver.models.Participation;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ParticipationDTO {
    ParticipationDTO participationDTO;

    public ParticipationDTO(ParticipationDTO participationDTO) {
        this.participationDTO = participationDTO;
    }
}

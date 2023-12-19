package com.surver.dtos.participation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class ListOfParticipationsDTO {
    List<ParticipationDTO> participationDTOs;

    public ListOfParticipationsDTO(List<ParticipationDTO> participationDTOs) {
        this.participationDTOs = participationDTOs;
    }
}

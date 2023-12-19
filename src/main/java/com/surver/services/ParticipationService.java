package com.surver.services;

import com.surver.dtos.delete.DeleteDTO;
import com.surver.dtos.participation.ListOfParticipationsDTO;
import com.surver.dtos.participation.ParticipationDTO;
import com.surver.models.Participation;

public interface ParticipationService {
    ListOfParticipationsDTO getListOfparticipations();
    ParticipationDTO getParticipationByID(Long id);
    ParticipationDTO createParticipationByParticipationDTO(ParticipationDTO participationDTO);

    ParticipationDTO updateParticipationByParticipation(Participation participation);

    DeleteDTO deleteParticipationByParticipationDTO(ParticipationDTO participationDTO);


    DeleteDTO deleteParticipationByParticipationID(Long id);

    ParticipationDTO updateParticipationByParticipationDTO(ParticipationDTO participationDTO);
}

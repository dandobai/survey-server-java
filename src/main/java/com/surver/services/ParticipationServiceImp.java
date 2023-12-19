package com.surver.services;

import com.surver.dtos.delete.DeleteDTO;
import com.surver.dtos.participation.ListOfParticipationsDTO;
import com.surver.dtos.participation.ParticipationDTO;
import com.surver.enums.Deleted;
import com.surver.models.Participation;
import com.surver.repositories.ParticipationRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ParticipationServiceImp implements ParticipationService {
    private final ParticipationRepository participationRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ParticipationServiceImp(ParticipationRepository participationRepository, ModelMapper modelMapper){
        this.participationRepository = participationRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ListOfParticipationsDTO getListOfparticipations() {
        return modelMapper.map(participationRepository.findAll(),ListOfParticipationsDTO.class);
    }

    @Override
    public ParticipationDTO getParticipationByID(Long id) {
        Optional<Participation> participation = participationRepository.findById(id);
        return modelMapper.map(participation,ParticipationDTO.class);
    }

    @Override
    public ParticipationDTO createParticipationByParticipationDTO(ParticipationDTO participationDTO) {
        Participation participation = modelMapper.map(participationDTO, Participation.class);
        participationRepository.save(participation);
        return modelMapper.map(participation,ParticipationDTO.class);
    }

    @Override
    public ParticipationDTO updateParticipationByParticipation(Participation participation) {
        participationRepository.save(participation);
        return modelMapper.map(participation,ParticipationDTO.class);
    }

    @Override
    public DeleteDTO deleteParticipationByParticipationDTO(ParticipationDTO participationDTO) {
        Participation participation = modelMapper.map(participationDTO,Participation.class);
        participationRepository.delete(participation);
        return new DeleteDTO(participation.getId(), Deleted.YES);
    }

    @Override
    public DeleteDTO deleteParticipationByParticipationID(Long id) {
        participationRepository.deleteById(id);
        return new DeleteDTO(id, Deleted.YES);
    }

    @Override
    public ParticipationDTO updateParticipationByParticipationDTO(ParticipationDTO participationDTO) {
        return null;
    }
}

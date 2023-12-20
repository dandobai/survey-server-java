package com.surver.services;

import com.surver.dtos.delete.DeleteDTO;
import com.surver.dtos.status.ListOfStatusDTO;
import com.surver.dtos.status.StatusDTO;
import com.surver.dtos.survey.ListOfSurveyDTO;
import com.surver.dtos.survey.SurveyDTO;
import com.surver.enums.Deleted;
import com.surver.models.Status;
import com.surver.models.Survey;
import com.surver.repositories.StatusRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StatusServiceImp implements StatusService{
    private final StatusRepository statusRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public StatusServiceImp(StatusRepository statusRepository,
                            ModelMapper modelMapper){
        this.statusRepository = statusRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ListOfStatusDTO getListOfStatus() {
        return modelMapper.map(statusRepository.findAll(), ListOfStatusDTO.class);
    }

    @Override
    public StatusDTO getStatusById(Long id) {
        Optional<Status> status = statusRepository.findById(id);
        return modelMapper.map(status, StatusDTO.class);
    }

    @Override
    public StatusDTO createStatusByStatusDTO(StatusDTO statusDTO) {
        Status status = modelMapper.map(statusDTO, Status.class);
        statusRepository.save(status);
        return modelMapper.map(status,StatusDTO.class);
    }

    @Override
    public StatusDTO updateStatusByStatusDTO(StatusDTO statusDTO) {
        Status status = modelMapper.map(statusDTO,Status.class);
        statusRepository.save(status);
        return modelMapper.map(status,StatusDTO.class);    }

    @Override
    public DeleteDTO deletestatusBystatusDTO(StatusDTO statusDTO) {
        Status status = modelMapper.map(statusDTO,Status.class);
        statusRepository.delete(status);
        return new DeleteDTO(status.getId(), Deleted.YES);
    }

    @Override
    public DeleteDTO deleteStausByStatusId(Long id) {
        statusRepository.deleteById(id);
        return new DeleteDTO(id, Deleted.YES);
    }
}

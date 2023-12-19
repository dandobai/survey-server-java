package com.surver.services;

import com.surver.dtos.delete.DeleteDTO;
import com.surver.dtos.status.ListOfStatusDTO;
import com.surver.dtos.status.StatusDTO;
import com.surver.repositories.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusServiceImp implements StatusService{
    private final StatusRepository statusRepository;

    @Autowired
    public StatusServiceImp(StatusRepository statusRepository){
        this.statusRepository = statusRepository;
    }

    @Override
    public ListOfStatusDTO getListOfStatus() {
        return null;
    }

    @Override
    public StatusDTO getStatusById(String id) {
        return null;
    }

    @Override
    public StatusDTO createStatusByStatusDTO(StatusDTO statusDTO) {
        return null;
    }

    @Override
    public StatusDTO updateStatusByStatusDTO(StatusDTO statusDTO) {
        return null;
    }

    @Override
    public DeleteDTO deletestatusBystatusDTO(StatusDTO statusDTO) {
        return null;
    }

    @Override
    public DeleteDTO deleteStausByStatusId(Long id) {
        return null;
    }
}

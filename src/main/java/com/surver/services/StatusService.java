package com.surver.services;

import com.surver.dtos.delete.DeleteDTO;
import com.surver.dtos.status.ListOfStatusDTO;
import com.surver.dtos.status.StatusDTO;

public interface StatusService {
    ListOfStatusDTO getListOfStatus();
    StatusDTO getStatusById(Long id);
    StatusDTO createStatusByStatusDTO(StatusDTO statusDTO);
    StatusDTO updateStatusByStatusDTO(StatusDTO statusDTO);
    DeleteDTO deletestatusBystatusDTO(StatusDTO statusDTO);

    DeleteDTO deleteStausByStatusId(Long id);
}

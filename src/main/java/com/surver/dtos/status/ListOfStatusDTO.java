package com.surver.dtos.status;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class ListOfStatusDTO {
    List<StatusDTO> statusDTOs;

    public ListOfStatusDTO(List<StatusDTO> statusDTOs) {
        this.statusDTOs = statusDTOs;
    }
}

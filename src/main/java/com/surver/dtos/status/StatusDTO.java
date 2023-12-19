package com.surver.dtos.status;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class StatusDTO {
    StatusDTO statusDTO;

    public StatusDTO(StatusDTO statusDTO) {
        this.statusDTO = statusDTO;
    }
}

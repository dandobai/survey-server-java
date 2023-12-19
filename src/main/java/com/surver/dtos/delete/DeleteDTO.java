package com.surver.dtos.delete;

import com.surver.enums.Deleted;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class DeleteDTO {
    Long id;
    Deleted deleted;

    public DeleteDTO(Long id, Deleted deleted) {
        this.id = id;
        this.deleted = deleted;
    }
}

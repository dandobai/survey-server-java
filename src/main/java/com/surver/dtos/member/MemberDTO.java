package com.surver.dtos.member;

import com.surver.models.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class MemberDTO {
    MemberDTO memberDTO;
    public MemberDTO(MemberDTO memberDTO) {
        this.memberDTO = memberDTO;
    }
}

package com.surver.services;

import com.surver.dtos.delete.DeleteDTO;
import com.surver.dtos.member.*;
import com.surver.models.Member;

public interface MemberService {
    ListOfMembersDTO getListOfMembers();
    MemberDTO getMemberById(Long id);
    MemberDTO createMemberByMemberDTO(MemberDTO memberDTO);
    MemberDTO updateMemberByMemberDTO(Member member);
    DeleteDTO deleteMemberByMemberDTO(MemberDTO memberDTO);

    DeleteDTO deleteMemberByID(Long id);
}

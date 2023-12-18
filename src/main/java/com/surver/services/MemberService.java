package com.surver.services;

import com.surver.dtos.ListOfMembersDTO;
import com.surver.models.Member;

import java.util.List;

public interface MemberService {
    ListOfMembersDTO getListOfMembers();
}

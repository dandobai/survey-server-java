package com.surver.services;

import com.surver.dtos.delete.DeleteDTO;
import com.surver.dtos.member.*;
import com.surver.enums.Deleted;
import com.surver.models.Member;
import com.surver.repositories.MemberRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberServiceImp implements MemberService{
    private final MemberRepository memberRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public MemberServiceImp(MemberRepository memberRepository,
                            ModelMapper modelMapper) {
        this.memberRepository = memberRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ListOfMembersDTO getListOfMembers() {
        return modelMapper.map(memberRepository.findAll(),ListOfMembersDTO.class);
    }

    @Override
    public MemberDTO getMemberById(String id) {
        Optional<Member> member = memberRepository.findById(Integer.parseInt(id));
        return modelMapper.map(member,MemberDTO.class);
    }

    @Override
    public MemberDTO createMemberByMemberDTO(MemberDTO memberDTO) {
        Member member = modelMapper.map(memberDTO, Member.class);
        memberRepository.save(member);
        return modelMapper.map(member,MemberDTO.class);
    }

    @Override
    public MemberDTO updateMemberByMemberDTO(Member member) {
        memberRepository.save(member);
        return modelMapper.map(member,MemberDTO.class);
    }

    @Override
    public DeleteDTO deleteMemberByMemberDTO(MemberDTO memberDTO) {
        Member member = modelMapper.map(memberDTO,Member.class);
        memberRepository.delete(member);
        return new DeleteDTO(member.getId(),Deleted.YES);
    }

    @Override
    public DeleteDTO deleteMemberByID(String id) {
        Long idInt = Long.valueOf(id);
        memberRepository.deleteById(idInt.intValue());
        return new DeleteDTO(idInt, Deleted.YES);
    }
}

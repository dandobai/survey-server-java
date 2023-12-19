package com.surver.controllers;

import com.surver.dtos.delete.DeleteDTO;
import com.surver.dtos.member.ListOfMembersDTO;
import com.surver.dtos.member.MemberDTO;
import com.surver.models.Member;
import com.surver.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }
    @GetMapping("/members")
    public ResponseEntity<ListOfMembersDTO> getListOfMembersDTO() {
        return ResponseEntity.ok(memberService.getListOfMembers());
    }
    @GetMapping("/members/{id}")
    public ResponseEntity<MemberDTO> getMemberDTO(@PathVariable String id) {
        return ResponseEntity.ok(memberService.getMemberById(id));
    }
    @PostMapping("/addmember")
    public ResponseEntity<MemberDTO> createMember(MemberDTO memberDTO) {
        return ResponseEntity.ok(memberService.createMemberByMemberDTO(memberDTO));
    }
    @PutMapping("/updatemember")
    public ResponseEntity<MemberDTO> updateMember(Member member) {
        return ResponseEntity.ok(memberService.updateMemberByMemberDTO(member));
    }
    @DeleteMapping("/deletemember")
    public ResponseEntity<DeleteDTO> deleteMember(MemberDTO memberDTO) {
        return ResponseEntity.ok(memberService.deleteMemberByMemberDTO(memberDTO));
    }
    @DeleteMapping("/deletemember/{id}")
    public ResponseEntity<DeleteDTO> deleteMember(@PathVariable String id) {
        return ResponseEntity.ok(memberService.deleteMemberByID(id));
    }
}

package com.surver.controllers;

import com.surver.dtos.ListOfMembersDTO;
import com.surver.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }
    @GetMapping("/members")
    public ResponseEntity<ListOfMembersDTO> getListOfMembers() {
        return ResponseEntity.ok(memberService.getListOfMembers());
    }
}

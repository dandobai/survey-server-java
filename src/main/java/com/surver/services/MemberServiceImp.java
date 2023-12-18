package com.surver.services;

import com.surver.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImp implements MemberService{
    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImp(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
}

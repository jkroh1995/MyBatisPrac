package com.example.demo.service;

import com.example.demo.member.PostMemberDto;
import com.example.demo.member.SingleMemberDto;

public interface MemberService {

    SingleMemberDto findMember(long memberId);
    void postMember(PostMemberDto dto);
}

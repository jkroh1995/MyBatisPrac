package com.example.demo.service;

import com.example.demo.mapper.member.MemberMapper;
import com.example.demo.member.PostMemberDto;
import com.example.demo.member.SingleMemberDto;
import com.example.demo.model.Member;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberServiceImpl implements MemberService{
    private final MemberMapper mapper;

    public MemberServiceImpl(MemberMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    @Transactional(readOnly = true)
    public SingleMemberDto findMember(long memberId) {
        Member member = mapper.selectMember(memberId);
        return SingleMemberDto.of(member);
    }

    @Override
    @Transactional
    public void postMember(PostMemberDto dto) {
        mapper.insertMember(dto.name(), dto.email());
    }
}

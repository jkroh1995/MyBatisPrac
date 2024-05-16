package com.example.demo.member;

import com.example.demo.model.Member;

public record SingleMemberDto(
        long id,
        String name,
        String email
) {
    public static SingleMemberDto of(Member member) {
        return new SingleMemberDto(member.getId(), member.getName(), member.getEmail());
    }
}

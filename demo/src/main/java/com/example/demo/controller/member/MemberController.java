package com.example.demo.controller.member;

import com.example.demo.member.PostMemberDto;
import com.example.demo.member.SingleMemberDto;
import com.example.demo.service.MemberService;
import com.fasterxml.jackson.databind.annotation.NoClass;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public ResponseEntity<NoClass> postMember(@RequestBody PostMemberDto dto){
        memberService.postMember(dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{member-id}")
    public ResponseEntity<SingleMemberDto> getMember(@PathVariable("member-id") long memberId){
        SingleMemberDto member = memberService.findMember(memberId);
        return ResponseEntity.ok(member);
    }
}

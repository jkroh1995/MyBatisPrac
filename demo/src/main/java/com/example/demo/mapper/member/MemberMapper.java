package com.example.demo.mapper.member;

import com.example.demo.model.Member;
import org.apache.ibatis.annotations.*;

@Mapper
public interface MemberMapper {
    @Select("SELECT * FROM Member WHERE id=#{memberId}")
    Member selectMember(long memberId);

    @Insert("INSERT INTO Member (name, email) VALUES (#{name}, #{email})")
    @Options(useGeneratedKeys = true, keyColumn = "id")
    void insertMember(String name, String email);
}

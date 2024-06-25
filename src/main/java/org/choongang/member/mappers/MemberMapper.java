package org.choongang.member.mappers;

import org.choongang.member.entities.Member;

public interface MemberMapper {
    Member getMember(String email);
    int exists(String email);
    int register(Member member);
}

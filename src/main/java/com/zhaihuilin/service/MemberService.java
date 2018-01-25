package com.zhaihuilin.service;

import com.zhaihuilin.entity.Member;

import java.util.List;

/**
 * Created by zhaihuilin on 2018/1/18  14:24.
 */
public interface MemberService {

    public Member saveMember(Member member);

    public Member updateMember(Member member);

    public Member findMemberById(String id);

    public List<Member> findAll();
}

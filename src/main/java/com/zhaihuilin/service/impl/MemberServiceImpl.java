package com.zhaihuilin.service.impl;

import com.zhaihuilin.dao.MemberRepostiory;
import com.zhaihuilin.entity.Member;
import com.zhaihuilin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhaihuilin on 2018/1/18  14:25.
 */
@Service
@Transactional
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepostiory memberRepostiory;


    @Override
    public Member saveMember(Member member) {
        return memberRepostiory.save(member);
    }

    @Override
    public Member updateMember(Member member) {
        return memberRepostiory.save(member);
    }

    @Override
    public Member findMemberById(String id) {
        return memberRepostiory.findMemberById(id);
    }

    @Override
    public List<Member> findAll() {
        return memberRepostiory.findAll();
    }
}

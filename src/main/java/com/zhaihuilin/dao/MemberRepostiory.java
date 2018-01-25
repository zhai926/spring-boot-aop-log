package com.zhaihuilin.dao;

import com.zhaihuilin.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhaihuilin on 2018/1/18  14:22.
 */
public interface MemberRepostiory extends JpaRepository<Member,Long> {

    public  Member findMemberById(String id);

    public  Member deleteMemberById(String id);
}

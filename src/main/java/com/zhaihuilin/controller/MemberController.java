package com.zhaihuilin.controller;

import com.zhaihuilin.entity.Member;
import com.zhaihuilin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaihuilin on 2018/1/18  14:20.
 */
@RestController
@RequestMapping("/member")
public class MemberController {


    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/save")
    public Member saveMember(
         @RequestParam(value = "name",required = true,defaultValue = "") String name,
         @RequestParam(value = "password",required = true,defaultValue = "") String password,
         @RequestParam(value = "age",required = true,defaultValue = "") String age
         ){
         Member member =new Member();
         member.setAge(Integer.parseInt(age));
         member.setName(name);
         member.setPassword(password);
         memberService.saveMember(member);
         return  member;
    }

    @RequestMapping(value = "/findMemberById")
    public Member findMemberById(
            @RequestParam(value = "id",required = true,defaultValue = "") String id
    ){
            Member member= memberService.findMemberById(id);
            return  member;
    }

    @RequestMapping(value = "/findAll")
    public Map<String,Object> findAll(){
         Map<String,Object> map = new HashMap();
         List<Member> list=memberService.findAll();
         map.put("list",list);
         return map;
    }
}

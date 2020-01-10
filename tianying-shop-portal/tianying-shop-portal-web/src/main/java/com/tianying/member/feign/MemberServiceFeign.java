package com.tianying.member.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.tianying.member.api.service.MemberService;



@FeignClient("app-tianying-member")
public interface MemberServiceFeign extends MemberService {

}

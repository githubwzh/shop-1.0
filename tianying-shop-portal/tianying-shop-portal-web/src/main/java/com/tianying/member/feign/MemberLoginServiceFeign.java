package com.tianying.member.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.tianying.member.api.service.MemberLoginService;

@FeignClient("app-tianying-member")
public interface MemberLoginServiceFeign extends MemberLoginService {

}

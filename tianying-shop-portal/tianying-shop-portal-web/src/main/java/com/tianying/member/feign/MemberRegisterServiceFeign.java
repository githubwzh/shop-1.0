package com.tianying.member.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.tianying.member.api.service.MemberRegisterService;


@FeignClient("app-tianying-member")
public interface MemberRegisterServiceFeign extends MemberRegisterService {

}

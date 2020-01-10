package com.tianying.member.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.tianying.weixin.api.service.VerificaCodeService;

@FeignClient("app-tianying-weixin")
public interface VerificaCodeServiceFeign extends VerificaCodeService {

}

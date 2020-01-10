package com.tianying.core.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.tianying.base.BaseApiService;
import com.tianying.base.BaseResponse;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends BaseApiService<JSONObject> {
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public BaseResponse<JSONObject> exceptionHandler(Exception e) {
		log.info("###全局捕获异常###,error:{}", e);
		return setResultError("系统错误!");
	}
}

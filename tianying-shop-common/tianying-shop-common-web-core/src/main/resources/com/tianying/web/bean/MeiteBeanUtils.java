package com.tianying.web.bean;

import org.springframework.beans.BeanUtils;

public class MeiteBeanUtils<Vo, Dto> {

	/**
	 * dot 转换为Do 工具类
	 * 
	 * @param dtoEntity
	 * @param doEntity
	 * @return
	 */
	public static <Dto> Dto voToDto(Object voEntity, Class<Dto> dtoClass) {
		// 判断VoSF是否为空!
		if (voEntity == null) {
			return null;
		}
		// 判断DtoClass 是否为空
		if (dtoClass == null) {
			return null;
		}
		try {
			Dto newInstance = dtoClass.newInstance();
			BeanUtils.copyProperties(voEntity, newInstance);
			// Dto转换Do
			return newInstance;
		} catch (Exception e) {
			return null;
		}
	}

	// 后面集合类型带封装
}

package com.aj.dao;

import com.aj.common.constant.ErrorCodeConstant;
import com.aj.common.service.BaseService;
import com.aj.module.exception.ApiErrorCodeException;
import com.google.gson.JsonObject;

public class test extends BaseService{

	
	public static void main(String[] args) {
		
		JsonObject resultObj = new JsonObject();
		resultObj.addProperty(ErrorCodeConstant.LABEL_CODE, ErrorCodeConstant.CODE_SUCCESS);
		resultObj.addProperty(ErrorCodeConstant.LABEL_DESC, ErrorCodeConstant.DESC_SUCCESS);

		try {
			
			throw new ApiErrorCodeException("hello", "111");
			
		} catch (Exception e) {
			BaseService baseService = new BaseService();
			baseService.catchException(e, resultObj);
			// TODO: handle exception
		}

		System.out.println(resultObj.toString());
		
	}
	
	
	
}

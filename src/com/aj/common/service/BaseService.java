package com.aj.common.service;

import com.aj.common.constant.ErrorCodeConstant;
import com.aj.module.exception.ApiErrorCodeException;
import com.google.gson.JsonObject;

public class BaseService {

	
	public JsonObject catchException(Exception ex, JsonObject resObj){
		
		if(ex instanceof ApiErrorCodeException) {
			ApiErrorCodeException a = (ApiErrorCodeException)ex;
			resObj.addProperty(ErrorCodeConstant.LABEL_CODE, a.getErrorCode());
			resObj.addProperty(ErrorCodeConstant.LABEL_DESC, a.getErrorMessage());
		}else {
			resObj.addProperty(ErrorCodeConstant.LABEL_CODE, ErrorCodeConstant.CODE_FAIL_ERROR);
			resObj.addProperty(ErrorCodeConstant.LABEL_DESC, ErrorCodeConstant.DESC_FAIL_ERROR);
		}
		
		
		return resObj;
		
	}
	
}

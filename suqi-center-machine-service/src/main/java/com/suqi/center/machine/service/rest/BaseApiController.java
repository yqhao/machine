package com.suqi.center.machine.service.rest;

import com.suqi.center.common.dto.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

import java.util.function.Supplier;

public abstract class BaseApiController implements InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {

	}

	protected Logger logger = LoggerFactory.getLogger(getClass());

	public <T> Result<T> rest(Supplier<T> supplier){
		return Result.data(supplier.get());
	}
}

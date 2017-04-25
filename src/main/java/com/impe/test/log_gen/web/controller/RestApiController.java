package com.impe.test.log_gen.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.impe.test.log_gen.core.LogScheduler;
import com.impe.test.log_gen.model.LogConfiguration;
import com.impe.test.log_gen.model.LogConfigurationManager;
import com.impe.test.log_gen.model.LogConfigurationMem;

@Api(value = "/config")
@RestController
public class RestApiController {

	@Autowired
	LogConfigurationManager logConfigurationManager;
	@Autowired 
	LogScheduler logScheduler;
	
	@ApiOperation(value = "PostConfig")
	@RequestMapping(value = "/config", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	public ResponseEntity<LogConfigurationMem> setConfig(@RequestBody LogConfigurationMem logConfiguration) {
		logConfigurationManager.setLogConfiguration(logConfiguration);
		return new ResponseEntity<>(logConfiguration, HttpStatus.OK);
	}

	@ApiOperation(value = "GetConfig")
	@RequestMapping(value = "/config", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	public LogConfiguration getConfig() {
		return logConfigurationManager.getLogConfiguration();

	}

}

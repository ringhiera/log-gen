package com.impe.test.log_gen.web.controller;

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

@RestController
public class RestApiController {

	@Autowired
	LogConfigurationManager logConfigurationManager;
	@Autowired 
	LogScheduler logScheduler;
	
	@RequestMapping(value = "/config", method = RequestMethod.POST)
	public ResponseEntity<LogConfigurationMem> setConfig(@RequestBody LogConfigurationMem logConfiguration) {
		logConfigurationManager.setLogConfiguration(logConfiguration);
		return new ResponseEntity<>(logConfiguration, HttpStatus.OK);
	}

	@RequestMapping(value = "/config", method = RequestMethod.GET)
	public LogConfiguration getConfig() {
		return logConfigurationManager.getLogConfiguration();

	}

}

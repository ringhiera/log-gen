package com.impe.test.log_gen.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class LogConfigurationDao {

	public LogConfiguration getLogConfiguration(){
		return new LogConfigurationHardcoded();
	}
}
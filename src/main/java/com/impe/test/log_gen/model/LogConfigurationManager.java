package com.impe.test.log_gen.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.impe.test.log_gen.core.LogScheduler;
import com.impe.test.log_gen.core.LogTimerTask;

@Component
public class LogConfigurationManager {
	private static Logger LOG = LoggerFactory.getLogger(LogConfigurationManager.class);

	
	@Autowired
	@Qualifier("logScheduler")
	private LogScheduler logScheduler;
	private LogConfiguration logConfiguration = new LogConfigurationHardcoded();
	
	public LogConfiguration getLogConfiguration(){
		LOG.info("getLogConfiguration");
		return logConfiguration;
	}

	public void setLogConfiguration(LogConfiguration logConfiguration) {
		LOG.info("Set Log Configuration");
		logScheduler.setUp(logConfiguration);
		this.logConfiguration = logConfiguration;
	}
	
}
package com.impe.test.log_gen.model;

import java.util.List;

public class LogConfigurationMem implements LogConfiguration {

	List<LogGen> logGens;

	@Override
	public List<LogGen> getLogGens() {
		return logGens;
	}

	public void setLogGens(List<LogGen> logGens) {
		this.logGens = logGens;
	}

//	public LogConfigurationMem(List<LogGen> logGens) {
//		super();
//		this.logGens = logGens;
//	}

	
}

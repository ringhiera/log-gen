package com.impe.test.log_gen.model;

import java.util.ArrayList;
import java.util.List;

public class LogConfigurationHardcoded implements LogConfiguration {

	List<LogGen> logGens;

	public LogConfigurationHardcoded(){
		logGens = new ArrayList<>();
		logGens.add(new LogGen("Hello World!", "INFO", 0L, 3000L));
		logGens.add(new LogGen("Waning World!", "WARN", 0L, 1000L));
		logGens.add(new LogGen("Error World!\n\tMultiline ..", "ERROR", 0L, 1234L));
	}

	@Override
	public List<LogGen> getLogGens() {
		return logGens;
	}

	@Override
	public void setLogGens(List<LogGen> logGens) {
		this.logGens = logGens;
	}
	
}

package com.impe.test.log_gen.model;

import java.util.List;

public interface LogConfiguration {

	public abstract List<LogGen> getLogGens();
	public abstract void setLogGens(List<LogGen> logGens);
}
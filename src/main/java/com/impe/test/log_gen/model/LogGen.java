package com.impe.test.log_gen.model;

public class LogGen {

	private final String logbody;
	private final String severity; // use enumerable instead
	private final long delay;
	private final long period;
	
	
	public LogGen(String logbody, String severity, long delay, long period) {
		super();
		this.logbody = logbody;
		this.severity = severity;
		this.delay = delay;
		this.period = period;
	}
	public String getLogbody() {
		return logbody;
	}
	public String getSeverity() {
		return severity;
	}
	public long getDelay() {
		return delay;
	}
	public long getPeriod() {
		return period;
	}

	
}

package com.impe.test.log_gen.model;

public class LogGen {

	private String logbody;
	private String severity; // use enumerable instead
	private long delay;
	private long period;
	

	public LogGen() {
	}
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
	public void setLogbody(String logbody) {
		this.logbody = logbody;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public void setDelay(long delay) {
		this.delay = delay;
	}
	public void setPeriod(long period) {
		this.period = period;
	}

	
}

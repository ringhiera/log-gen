package com.impe.test.log_gen.core;

import java.util.TimerTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTimerTask extends TimerTask {
	private static Logger LOG = LoggerFactory.getLogger(LogTimerTask.class);

	private long counter;
	private final String logbody;
	private final String severity; // use enumerable instead


	public LogTimerTask(String logbody, String severity) {
		super();
		this.logbody = logbody;
		this.severity = severity;
	}

	@Override
	public void run() {
		switch (severity) {
		case "DEBUG":
			LOG.debug("Series: "+(counter++) +" - "+logbody);
			break;
		case "INFO":
			LOG.info("Series: "+(counter++) +" - "+logbody);
			break;
		case "WARN":
			LOG.warn("Series: "+(counter++) +" - "+logbody);
			break;
		case "ERROR":
			LOG.error("Series: "+(counter++) +" - "+logbody);
			break;
		default:
			break;
		}

	}
}

package com.impe.test.log_gen.core;

import java.util.Timer;

import org.springframework.stereotype.Component;

import com.impe.test.log_gen.model.LogConfiguration;
import com.impe.test.log_gen.model.LogGen;

@Component("logScheduler")
public class LogScheduler {

	private Timer uploadCheckerTimer;

	public void setUp(final LogConfiguration logConfiguration) {
		// Terminate any prevous activity if any
		if (null != uploadCheckerTimer)
			this.tearDown();
		//reinitialize the timer
		uploadCheckerTimer = new Timer(true);
		for (LogGen lg : logConfiguration.getLogGens()) {
			uploadCheckerTimer.scheduleAtFixedRate(
					new LogTimerTask(lg.getLogbody(), lg.getSeverity()),
					lg.getDelay(), lg.getPeriod());
		}
	}

	public void tearDown() {
		uploadCheckerTimer.cancel();
		uploadCheckerTimer.purge();
	}

}

package com.impe.test.log_gen.core;

import java.util.Timer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.impe.test.log_gen.model.LogConfiguration;
import com.impe.test.log_gen.model.LogGen;

@Component("logScheduler")
public class LogScheduler {
	private static Logger LOG = LoggerFactory.getLogger(LogScheduler.class);

	private Timer uploadCheckerTimer;

	public void setUp(final LogConfiguration logConfiguration) {
		LOG.debug("\n\nInitializing Timers\n\n");
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
		LOG.debug("\n\nTeardown Scheduler\n\n");
		uploadCheckerTimer.cancel();
		uploadCheckerTimer.purge();
	}

}

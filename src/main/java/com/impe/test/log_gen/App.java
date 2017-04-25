package com.impe.test.log_gen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.impe.test.log_gen.core.LogScheduler;
import com.impe.test.log_gen.core.LogTimerTask;
import com.impe.test.log_gen.model.LogConfigurationManager;

/**
 * Hello world!
 *
 */
@Component("logGen")
public class App {
	private static Logger LOG = LoggerFactory.getLogger(LogTimerTask.class);

	@Autowired
	private LogConfigurationManager logConfigurationDao;
	@Autowired
	private LogScheduler logScheduler;

	private void run() {
		logScheduler.setUp(logConfigurationDao.getLogConfiguration());
		while(true){
			// do nothing
		}
	}

	public static void main(String[] args) {
		// open/read the application context file
		LOG.info("init");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		LOG.info("1");
		App app = (App) ctx.getBean("logGen");
		LOG.info("2");
		app.run();
		LOG.info("4");
	}
}

package com.sumit.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;

@SpringBootApplication
public class MonitoringSlownessMetricsApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(MonitoringSlownessMetricsApplication.class);
		application.setApplicationStartup(new BufferingApplicationStartup(10000));
		application.run(args);
	}
}

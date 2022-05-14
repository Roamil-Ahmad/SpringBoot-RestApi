package com.hblmfb.bbs;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator extends AbstractHealthIndicator {

	@Override
	protected void doHealthCheck(Builder builder) throws Exception {
		// You can use the builder to display status details
        builder.up()
                .withDetail("Service", "Running")
                .withDetail("Error", "No Error- Healthy status");
        //If you add below line, it will show on the health page - "error":"java.lang.RuntimeException:
        //.withException(new RuntimeException());
		
	}

}

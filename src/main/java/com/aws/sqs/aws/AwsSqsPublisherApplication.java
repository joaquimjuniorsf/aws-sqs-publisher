package com.aws.sqs.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = ContextStackAutoConfiguration.class)
@EnableScheduling
public class AwsSqsPublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsSqsPublisherApplication.class, args);
	}

}

package com.stackroute.SQSProducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration;

@SpringBootApplication(exclude = {ContextStackAutoConfiguration.class})
public class SqsProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqsProducerApplication.class, args);
	}

}

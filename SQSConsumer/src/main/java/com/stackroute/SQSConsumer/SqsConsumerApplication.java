package com.stackroute.SQSConsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;

@SpringBootApplication(exclude = {ContextStackAutoConfiguration.class})
public class SqsConsumerApplication {
	Logger logger= LoggerFactory.getLogger(SqsConsumerApplication.class);

	@SqsListener("Stackroute-Queue")
	public void loadMessageFromSQS(String message)  {
		System.out.println("Message received"+message);
		logger.info("message from SQS Queue {}",message);
	}

	public static void main(String[] args) {
		SpringApplication.run(SqsConsumerApplication.class, args);
	}

}

package com.benjamim.emailservice.infra.ses;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AwsSesConfig {

//    @Bean
//    public AmazonSimpleEmailService amazonSimpleEmailService() {
//        return AmazonSimpleEmailServiceClientBuilder.standard().build();
//    }

    @Bean
    public AmazonSimpleEmailService amazonSimpleEmailService() {
        return AmazonSimpleEmailServiceClient.builder()
                .withRegion("us-east-1") // Specify the appropriate AWS region
                .build();
    }
}




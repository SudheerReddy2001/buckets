package com.springboots3aws.springbootbucket.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class storageconfig {

    @Value("${cloud.aws.credentials.access-key}")
    private String accessKey;

   @Value("{cloud.aws.credentials.secret-key}")
    private String accessSecret;

   @Value("${cloud.aws.region.static}")
   private String region;



}

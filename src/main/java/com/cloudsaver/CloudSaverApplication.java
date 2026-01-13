package com.cloudsaver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.cloudsaver.config.CloudSaverProperties;

@SpringBootApplication
@EnableConfigurationProperties(CloudSaverProperties.class)
public class CloudSaverApplication {
  public static void main(String[] args) {
    SpringApplication.run(CloudSaverApplication.class, args);
  }
}

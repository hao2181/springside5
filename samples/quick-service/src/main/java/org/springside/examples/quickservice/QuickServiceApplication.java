package org.springside.examples.quickservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableConfigurationProperties
@ComponentScan
public class QuickServiceApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(QuickServiceApplication.class, args);
	}
}

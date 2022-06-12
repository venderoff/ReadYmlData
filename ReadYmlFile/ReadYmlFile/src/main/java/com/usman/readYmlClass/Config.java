package com.usman.readYmlClass;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class Config {		
	
	private String name ;
	private String environment ;
	private  List<String> servers = new ArrayList<>();
	

}

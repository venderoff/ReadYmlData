package com.usman.readYmlClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReadProperties {

	@Value("${spring.datasource.dbname} ")
	private String dbname ;
	
	@Value("${spring.datasource.url}")
	private String dburl ;
	
	@Autowired
	Config config ;
	
	@Bean
	public void main() {
		
		System.out.println("Environemnt is" + config.getEnvironment());
		
		System.out.println("Db url" + dburl );
		

		System.out.println("Db " + dbname);
	}
	
}

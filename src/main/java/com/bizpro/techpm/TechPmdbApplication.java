package com.bizpro.techpm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

//@SpringBootApplication(scanBasePackages = {"com.bizpro.techpm"})
//@EnableMongoRepositories(basePackages = "com.bizpro.techpm.repository")
public class TechPmdbApplication {

	public static void main(String[] args) {
		
		//System.setProperty("spring.config.name","techpmdbaccess");
		
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfig.class);
		//MongoOperations mongoOperation = (MongoOperations)ctx.getBean("mongoTemplate");

		SpringApplication.run(TechPmdbApplication.class, args);
		
		//ApplicationContext ctx = new GenericXmlApplicationContext("SpringConfig.xml");
		//MongoOperations mongoOperation = (MongoOperations)ctx.getBean("mongoTemplate");
	}
	
}

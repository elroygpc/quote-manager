package com.elroy.app.qmanager;


import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

//@EnableAutoConfiguration
@SpringBootApplication
public class Application extends SpringBootServletInitializer{
	
	private static final Logger log = Logger.getLogger(Application.class);


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
//	@Bean
//	public CommandLineRunner demo(QuoteRepository repository) {
//		return (args) -> {
//			// save a couple of quotes
//			repository.save(new Quote("Naan Yaar", "Sri Ramana Maharshi"));
//			repository.save(new Quote("No woman no cry", "Bob Marley"));
//			repository.save(new Quote("Guava Jelly", "Bob Marley"));
//
//			// fetch all customers
////			log.info("Customers found with findAll():");
////			log.info("-------------------------------");
////			for (Quote quote : repository.findAll()) {
////				log.info(quote.toString());
////			}
////			log.info("");
//
//			
////			// fetch a quote by ID
////			log.info(repository.findOne(2L));
//			
////			// fetch customers by last name
//			log.info("------------------- Quotes by Bob Marley -------------------");
//			for(Quote q: repository.findByAuthor("Bob Marley")) {
//				log.info(q.toString());
//			}
//		};
//	}


}

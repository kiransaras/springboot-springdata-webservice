package com.saraswathula.rest.webservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * The Class Application.
 */
@SpringBootApplication

public class Application extends SpringBootServletInitializer {

	static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		LOGGER.info("Application started");
		SpringApplication.run(Application.class, args);
	}

}

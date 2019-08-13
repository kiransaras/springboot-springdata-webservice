package com.saraswathula.rest.webservice;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.saraswathula.rest.webservice.resource.PlayerResource;
import com.saraswathula.rest.webservice.resource.WordFrequencyResource;

// TODO: Auto-generated Javadoc
/**
 * The Class JerseyConfig.
 */
@Configuration
public class JerseyConfig extends ResourceConfig {

	/**
	 * Instantiates a new jersey config.
	 * Registering the resources
	 */
	public JerseyConfig() {

		register(WordFrequencyResource.class);
		register(PlayerResource.class);

	}
}
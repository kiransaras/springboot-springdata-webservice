package com.saraswathula.rest.webservice.resource;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.saraswathula.rest.webservice.models.Frequency;
import com.saraswathula.rest.webservice.models.Paragraph;
import com.saraswathula.rest.webservice.service.WordFrequencyService;

// TODO: Auto-generated Javadoc
/**
 * The Class WordFrequencyResource.
 */
@Path("api")
public class WordFrequencyResource {

	/** The Constant LOGGER. */
	static final Logger LOGGER = LoggerFactory.getLogger(WordFrequencyResource.class);

	/** The word frequency rest service. */
	@Inject
	WordFrequencyService wordFrequencyRestService;

	/**
	 * Process word frequency request.
	 *
	 * @param paragraph
	 *            the paragraph
	 * @return the list
	 */
	@POST
	@Path("/wordfrequency")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Frequency> processWordFrequencyRequest(@Valid Paragraph paragraph) {
		LOGGER.info("processWordFrequencyRequest endpoint");
		return wordFrequencyRestService.getWordFrequency(paragraph);
	}

	/**
	 * Hello.
	 *
	 * @return the string
	 */
	@GET
	@Path("/health")
	@Produces("text/plain")
	public String hello() {
		LOGGER.info("health check endpoint");
		return "Health OK";
	}

}
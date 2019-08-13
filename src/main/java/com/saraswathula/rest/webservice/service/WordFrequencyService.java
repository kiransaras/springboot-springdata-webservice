package com.saraswathula.rest.webservice.service;

import java.util.List;

import com.saraswathula.rest.webservice.models.Frequency;
import com.saraswathula.rest.webservice.models.Paragraph;


// TODO: Auto-generated Javadoc
/**
 * The Interface WordFrequencyService.
 */
public interface WordFrequencyService {

	/**
	 * Gets the word frequency.
	 *
	 * @param para the para
	 * @return the word frequency
	 */
	public List<Frequency> getWordFrequency(Paragraph para);

}

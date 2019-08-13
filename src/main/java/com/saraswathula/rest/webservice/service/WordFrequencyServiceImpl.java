package com.saraswathula.rest.webservice.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.saraswathula.rest.webservice.models.Frequency;
import com.saraswathula.rest.webservice.models.Paragraph;
import com.saraswathula.rest.webservice.utils.MutableInteger;

// TODO: Auto-generated Javadoc
/**
 * The Class WordFrequencyServiceImpl.
 */
@Service
public class WordFrequencyServiceImpl implements WordFrequencyService {

	static final Logger LOGGER = LoggerFactory.getLogger(WordFrequencyServiceImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.saraswathula.rest.webservice.service.WordFrequencyService#
	 * getWordFrequency(com.saraswathula.rest.webservice.models.Paragraph)
	 */
	@Override
	public List<Frequency> getWordFrequency(Paragraph paragraph) {
		LOGGER.info("In getWordFrequency method" + "Paragraph::" + paragraph.toString());
		String para = paragraph.getPara();
		String[] words = para.split("\\W+");
		Map<String, MutableInteger> frequencyMap = new HashMap<>();
		frequencyMap = frequencyMapper(frequencyMap, words);
		return generatefrequencyList(frequencyMap);
	}

	/**
	 * Generatefrequency list.
	 *
	 * @param frequencyMap
	 *            the frequency map
	 * @return the list
	 */
	private List<Frequency> generatefrequencyList(Map<String, MutableInteger> frequencyMap) {
		LOGGER.info("In generatefrequencyList method " + "frequencyMap Size::" + frequencyMap.size());
		List<Frequency> frequencyList = new ArrayList<>();
		for (String word : frequencyMap.keySet()) {
			frequencyList.add(new Frequency(word, frequencyMap.get(word).getFrequency()));
		}
		Collections.sort(frequencyList);
		return frequencyList;
	}

	/**
	 * Frequency mapper.
	 *
	 * @param frequencyMap
	 *            the frequency map
	 * @param words
	 *            the words
	 * @return the map
	 */
	private Map<String, MutableInteger> frequencyMapper(Map<String, MutableInteger> frequencyMap, String[] words) {
		LOGGER.info("In frequencyMapper method ");
		for (String word : words) {
			frequencyMap.compute(word, (k, v) -> v == null ? new MutableInteger(0) : v).increment();
		}
		return frequencyMap;
	}
}

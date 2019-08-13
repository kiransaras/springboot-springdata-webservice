package com.saraswathula.rest.webservice.utils;

// TODO: Auto-generated Javadoc
/**
 * The Class MutableInteger.
 */
public class MutableInteger {
	
	/** The frequency. */
	int frequency;

	/**
	 * Instantiates a new mutable integer.
	 *
	 * @param frequency the frequency
	 */
	public MutableInteger(int frequency) {
		this.frequency = frequency;
	}

	/**
	 * Increment.
	 */
	public void increment() {
		this.frequency++;
	}

	/**
	 * Gets the frequency.
	 *
	 * @return the frequency
	 */
	public int getFrequency() {
		return frequency;
	}

	/**
	 * Sets the frequency.
	 *
	 * @param frequency the new frequency
	 */
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

}
package com.saraswathula.rest.webservice.models;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class Frequency.
 */
public class Frequency implements Comparable<Frequency>, Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The w. */
	String w;
	
	/** The n. */
	int n;

	/**
	 * Gets the w.
	 *
	 * @return the w
	 */
	public String getW() {
		return w;
	}

	/**
	 * Sets the w.
	 *
	 * @param w the new w
	 */
	public void setW(String w) {
		this.w = w;
	}

	/**
	 * Gets the n.
	 *
	 * @return the n
	 */
	public long getN() {
		return n;
	}

	/**
	 * Sets the n.
	 *
	 * @param n the new n
	 */
	public void setN(int n) {
		this.n = n;
	}

	/**
	 * Instantiates a new frequency.
	 *
	 * @param w the w
	 * @param n the n
	 */
	public Frequency(String w, int n) {
		super();
		this.w = w;
		this.n = n;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Frequency frequency) {
		return getW().compareTo(frequency.getW());
	}

}

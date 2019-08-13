package com.saraswathula.rest.webservice.models;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Paragraph {
	@NotNull
	private String para;

	public String getPara() {
		return para;
	}

	/**
	 * Sets the para.
	 *
	 * @param para
	 *            the new para
	 */
	public void setPara(String para) {
		this.para = para;
	}

	@Override
	public String toString() {
		return "Paragraph [para=" + para + "]";
	}

}

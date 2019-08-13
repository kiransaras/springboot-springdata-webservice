package com.saraswathula.rest.webservice.models;

import org.junit.Test;

import com.saraswathula.rest.webservice.models.Paragraph;
import com.saraswathula.rest.webservice.utils.PojoTestUtils;

public class ParagraphTest {
	@Test
	public void testAccesors_shouldAccessProperField() {

		PojoTestUtils.validateAccessors(Paragraph.class);
	}

}

package com.saraswathula.rest.webservice.models;

import org.junit.Test;

import com.saraswathula.rest.webservice.models.Frequency;
import com.saraswathula.rest.webservice.utils.PojoTestUtils;

public class FrequencyTest {

	@Test
	public void testAccesors_shouldAccessProperField() {

		PojoTestUtils.validateAccessors(Frequency.class);
	}

}

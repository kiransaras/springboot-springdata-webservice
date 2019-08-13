package com.saraswathula.rest.webservice.utils;

import org.junit.Test;

import com.saraswathula.rest.webservice.utils.MutableInteger;

public class MutableIntegerTest {

	@Test
	public void testAccesors_shouldAccessProperField() {

		PojoTestUtils.validateAccessors(MutableInteger.class);
	}

}

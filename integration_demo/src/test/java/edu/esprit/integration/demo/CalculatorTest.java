package edu.esprit.integration.demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    test_calcul t;
	@Before
	public void setUp() throws Exception {
		t= new test_calcul();
	}

	@Test
	public void test() {
		assertEquals(-1, t.calc(2,3,"add"));
	}

}
	




package edu.esprit.fibonacci;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FiboTest {
    test t;
	@Before
	public void setUp() throws Exception {
		t= new test();
	}

	@Test
	public void test() {
		assertEquals(-1, t.fibo(2));
	}

}

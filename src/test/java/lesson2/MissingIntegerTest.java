package lesson2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MissingIntegerTest {
	
	private MissingInteger missingInteger;
	
	@Before
	public void setUp() {
		missingInteger = new MissingInteger();
	}

	@Test
	public void test() {
		int A[] = {};
		assertEquals(0, missingInteger.solution(A));
	}

}

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
	public void testOneElementArray() {
		int A[] = {-100};
		assertEquals(1, missingInteger.solution(A));
		
		int B[] = {100};
		assertEquals(99, missingInteger.solution(B));
	}

	@Test
	public void testAllNegativeElementsArray() {
		int A[] = {-100, -8, -20, -11};
		assertEquals(1, missingInteger.solution(A));
	}
	
	@Test
	public void testHighElementsArray() {
		int A[] = {100, 81, 201, 110};
		assertEquals(80, missingInteger.solution(A));
	}
	
	@Test
	public void testWtithZeroElementsArray() {
		int A[] = {0, 2, 100, 81, 201, 110};
		assertEquals(1, missingInteger.solution(A));
	}
	
	@Test
	public void testPositiveElementsArray() {
		int A[] = {0, 1, 2, 3, 100, 81, 201, 110};
		assertEquals(4, missingInteger.solution(A));
		
		int B[] = {1, 3, 6, 4, 1, 2};
		assertEquals(5, missingInteger.solution(B));
	}
}

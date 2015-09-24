package lesson2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FrogRiverOneTest {
	private FrogRiverOne frogRiverOne;
	
	@Before
	public void setUp() {
		frogRiverOne = new FrogRiverOne();
	}
	
	@Test
	public void testNotPossibleArray() {
		int A[] = {2, 2, 3};
		assertEquals(-1, frogRiverOne.solution(4, A));
	}
	
	@Test
	public void testOneElementArray() {
		int A[] = {1};
		assertEquals(0, frogRiverOne.solution(1, A));
	}
	
	@Test
	public void testEndElementArray() {
		int A[] = {3, 2, 5, 1, 4};
		assertEquals(4, frogRiverOne.solution(4, A));
	}
	
	@Test
	public void testMiddleElementArray() {
		int A[] = {3, 2, 1, 5, 4};
		assertEquals(2, frogRiverOne.solution(1, A));
	}
}

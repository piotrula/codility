package lesson1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TapeEquilibriumTest {
	private TapeEquilibrium tapeEquilibrium;
	
	@Before
	public void setUp() {
		tapeEquilibrium = new TapeEquilibrium();
	}
	
	@Test
	public void testSmallestArray() {
		int A[] = {-3, 14};
		assertEquals(17, tapeEquilibrium.solution(A));
	}
	
	@Test
	public void testNegativeElementsArray() {
		int A[] = {-100, -99, -98};  
		assertEquals(97, tapeEquilibrium.solution(A));
		
		int B[] = {-21, -20, -19, -18};
		assertEquals(4, tapeEquilibrium.solution(B));
	}
	
	@Test
	public void testWithZeroElementsArray() {
		int A[] = {-2, -1, 0, 1, 2};  
		assertEquals(4, tapeEquilibrium.solution(A));
		
		int B[] = {-2, -1, 0, 1, 2, 3};
		assertEquals(3, tapeEquilibrium.solution(B));
	}
	
	@Test
	public void testPositiveElementsArray() {
		int A[] = {2, 3, 4, 5, 6};
		assertEquals(2, tapeEquilibrium.solution(A));
		
		int B[] = {2, 3, 4, 5, 6, 7};
		assertEquals(1, tapeEquilibrium.solution(B));
	}
	
	@Test
	public void testDuplicateElementsArray() {
		int A[] = {3, 3, 1, 5, 1}; 
		assertEquals(1, tapeEquilibrium.solution(A));
		
		int B[] = {3, 3, 1, 5, 1, 1};
		assertEquals(0, tapeEquilibrium.solution(B));
	}
}

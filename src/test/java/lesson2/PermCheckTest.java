package lesson2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PermCheckTest {
	private PermCheck permCheck;
	
	@Before
	public void setUp() {
		permCheck = new PermCheck();
	}
	
	@Test
	public void testOneElementArray() {
		int A[] = {1};
		assertEquals(1, permCheck.solution(A));
		
		int B[] = {2};
		assertEquals(0, permCheck.solution(B));
	}
	
	@Test
	public void testPermutationArray() {
		int A[] = {4, 2, 3, 1, 5};
		assertEquals(1, permCheck.solution(A));
	}
	
	@Test
	public void testNonPermutationArray() {
		int A[] = {4, 2, 3, 1, 5, 7};
		assertEquals(0, permCheck.solution(A));
	}
}

package lesson1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author piotrek
 *
 */
public class PermMissingElemTest {

	private PermMissingElem permMissingElem;
	
	@Before
	public void setUp() {
		permMissingElem = new PermMissingElem();
	}
	
	@Test
	public void testEmptyArray() {
		int A[] = {};
		assertEquals(1, permMissingElem.solution(A));
	}
	
	@Test
	public void testSingleElementArray() {
		int A[] = {2};
		assertEquals(1, permMissingElem.solution(A));
	}
	
	@Test
	public void testMultipleElementArray() {
		int A[] = {2, 3, 1, 5};
		assertEquals(4, permMissingElem.solution(A));
	}
	
	@Test
	public void testBoudaryStartMultipleElementArray() {
		int A[] = {4, 3, 2, 5};
		assertEquals(1, permMissingElem.solution(A));
		
		int B[] = {4, 2, 3, 5};
		assertEquals(1, permMissingElem.solution(B));
	}
	
	@Test
	public void testBoudaryEndMultipleElementArray() {
		int A[] = {4, 3, 2, 1};
		assertEquals(5, permMissingElem.solution(A));
	}
}

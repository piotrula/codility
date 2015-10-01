package lesson2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MaxCountersTest {
	private MaxCounters maxCounters;
	
	@Before
	public void setUp() {
		maxCounters = new MaxCounters();
	}
	
	@Test
	public void testNEqualOneOneElementArray() {
		int A[] = {1};
		int N = 1;
		int AExpected[] = {1};
		
		assertArrayEquals(AExpected, maxCounters.solution(N, A));
		
		int B[] = {2};
		int NN = 1;
		int BExpected[] = {0};
		
		assertArrayEquals(BExpected, maxCounters.solution(NN, B));
	}
	
	@Test
	public void testNEqualOneNormalArray() {
		int A[] = {3, 4, 4, 6, 1, 1};
		int N = 1;
		int AExpected[] = {2};
		
		assertArrayEquals(AExpected, maxCounters.solution(N, A));
		
		int B[] = {3, 4, 4, 6, 2, 3};
		int NN = 1;
		int BExpected[] = {0};
		
		assertArrayEquals(BExpected, maxCounters.solution(NN, B));
	}
	
	@Test
	public void testNormalSmallArray() {
		int A[] = {3, 4, 4, 6, 1, 4, 4};
		int N = 5;
		int AExpected[] = {3, 2, 2, 4, 2};
		
		assertArrayEquals(AExpected, maxCounters.solution(N, A));
		
		int B[] = {3, 4, 4, 6, 1, 6, 4};
		int NN = 5;
		int BExpected[] = {3, 2, 2, 4, 2};
		assertArrayEquals(BExpected, maxCounters.solution(NN, B));
	}

}

package lesson1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FrogJmpTest {

	private FrogJmp frogJmpInstance;
	
	@Before
	public void setUp() {
		frogJmpInstance = new FrogJmp();
	}
	
	@Test
	public void testYltX() {
		assertEquals(0, frogJmpInstance.solution(20, 10, 30));
		assertEquals(0, frogJmpInstance.solution(20, 0, 30));
	}

	@Test
	public void testYeqX() {
		assertEquals(0, frogJmpInstance.solution(20, 20, 30));
		assertEquals(0, frogJmpInstance.solution(50, 50, 20));
	}
	
	@Test
	public void testYgtX() {
		assertEquals(1, frogJmpInstance.solution(20, 30, 30));
		assertEquals(3, frogJmpInstance.solution(50, 100, 20));
	}
}
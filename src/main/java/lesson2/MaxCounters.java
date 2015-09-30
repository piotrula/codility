package lesson2;

/**
 * 
 * https://codility.com/programmers/task/max_counters
 * 
 * @author piotrek
 *
 */
public class MaxCounters {
	
	/**
	 * 
	 * @param N
	 * @param A
	 * @return
	 */
	public int[] solution(int N, int[] A) {
		int counters[] = new int[N];
		
		
		
		
		return new int[0];
	}
	
	private void maxCounter(int max, int counters[]) {
		if (counters != null) {
			for(int i = 0; i < counters.length; i++) {
				counters[i] = max;
			}
		}
	}
	
	/**
	 * 
	 * @param X
	 * @param counters
	 */
	private void increase(int X, int counters[]) {
		if (counters != null && X < counters.length) {
			counters[X - 1] += 1;
		}
	}
}

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
		int counters[] = null;
		
		int max = 0;
		int set = 0;
		
		for (int i = 0; i < A.length; i++) {
			int element = A[i];
			if (element >= 1 && element <= N) {
				if (counters == null) {
					counters = new int[N];
				}
				
				int m = increase(element, counters);
				if (m > max) {
					max = m;
				}
			} else if (element == (N + 1)) {
				set += max;
				max = 0;
				if (counters != null) {
					counters = new int[N];
				}
			}
		}
		
		if (counters == null) {
			counters = new int[N];
		}
		maxCounter(set, counters);
		
		return counters;
	}
	
	/**
	 * 
	 * @param max
	 * @param counters
	 */
	private void maxCounter(int max, int counters[]) {
		for(int i = 0; i < counters.length; i++) {
			counters[i] += max;
		}
	}
	
	/**
	 * 
	 * @param X
	 * @param counters
	 */
	private int increase(int X, int counters[]) {
		counters[X - 1] += 1;
		return counters[X - 1];
	}
}

package lesson1;

/**
 * https://codility.com/programmers/task/tape_equilibrium
 * 
 * @author piotrek
 *
 */
public class TapeEquilibrium {
	
	/**
	 * 
	 * @param A
	 * @return
	 */
	public int solution(int[] A) {
		
		int left = A[0];
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		for (int i = 1; i < A.length; i++) {
			sum += A[i];
		}
		
		for (int i = 1; i < A.length; i++) {

			if (Math.abs(left - sum) < min) {
				min = Math.abs(left - sum);
			}
			
			if (i < (A.length - 1)) {
				left += A[i];
				sum -= A[i];
			}
		}
		
		return min;
	}	
}

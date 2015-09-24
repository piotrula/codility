package lesson2;

/**
 * 
 * https://codility.com/programmers/task/frog_river_one
 * 
 * @author piotrek
 *
 */
public class FrogRiverOne {
	
	/**
	 * 
	 * @param X
	 * @param A
	 * @return
	 */
	public int solution(int X, int[] A) {
		
		int B[] = new int[X];
		
		for (int i = 0; i < A.length; i++) {
			int element = A[i];
			
			if ((element - 1) < B.length && (B[element - 1] > i || B[element - 1] == 0)) {
				B[element - 1] = i + 1;
			}
		}
		
		// Find max
		int max = -1;
		for (int i = 0; i < B.length; i++) {
			if (B[i] == 0) {
				return -1;
			}
			
			if (max < B[i]) {
				max = B[i];
			}
		}
		
		return max - 1;
	}
}

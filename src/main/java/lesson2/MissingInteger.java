package lesson2;

/**
 * https://codility.com/programmers/task/missing_integer
 * 
 * @author piotrek
 *
 */
public class MissingInteger {
	
	/**
	 * 
	 * @param A
	 * @return
	 */
	public int solution(int[] A) {
		
		if (A.length == 1) {
			if (A[0] <= 0) {
				return 1;
			}
			if (A[0] == 1) {
				return 2;
			}
			
			if (A[0] > 1) {
				return --A[0];
			}
		}
		
		int minVal = min(A);
		
		if (minVal == 0) {
			return 1;
		}
		
		if (minVal > 1) {
			return --minVal;
		}
		
		if (minVal == 1) {
			int B[] = new int[A.length];
			int possible = Integer.MAX_VALUE;
			for (int i = 0; i < A.length; i++) {
				int ele = A[i];
				if (ele > minVal && ele <= A.length) {
					B[ele - 1] = 1;
				}
				
				if (ele > A.length && possible > ele) {
					possible = ele;
				}
			}
			
			for (int i = (minVal); i < B.length; i++) {
				if (B[i] == 0) {
					return (i + 1);
				}
			}
			
			if (possible < Integer.MAX_VALUE) {
				return ++possible;
			}
			
			return B.length + 1;			
		}
		
		return Integer.MAX_VALUE;
	}
	
	/**
	 * 
	 * @param A
	 * @return
	 */
	private int min(int A[]) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0 && A[i] < min) {
				min = A[i];
			}
		}
		
		if (min == Integer.MAX_VALUE) {
			min = 0;
		}
		
		return min;
	}
}

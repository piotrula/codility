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
		int minVal = min(A);
		switch (minVal) {
			case 0:
				return 1;
			case 1:
				return findLowestIntSlot(minVal, A);
			default:
				return --minVal;
		}
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
	
	/**
	 *
	 * @param minVal
	 * @param array
	 * @return
	 */
	private int findLowestIntSlot(int minVal, int array[]) {
		int tmpArray[] = new int[array.length];
		int possibleSlot = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			int element = array[i];
			if (element > minVal && element <= array.length) {
				tmpArray[element - 1] = 1;
			} else if (element > array.length && possibleSlot > element) {
				possibleSlot = element;
			}
		}

		for (int i = minVal; i < tmpArray.length; i++) {
			if (tmpArray[i] == 0) {
				return (i + 1);
			}
		}

		if (possibleSlot < Integer.MAX_VALUE) {
			return ++possibleSlot;
		}

		return (tmpArray.length + 1);
	}
}

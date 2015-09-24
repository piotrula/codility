package lesson2;

/**
 * 
 * https://codility.com/programmers/task/perm_check
 * 
 * @author piotrek
 *
 */
public class PermCheck {
	
	/**
	 * 
	 * @param A
	 * @return
	 */
	public int solution(int[] A) {
		
		/*
		int index = 0;
		do {
			
			int element = A[index];
			if (element -1 > A.length) {
				return 0;
			}
			
			if (A[index] == (element -1)) {
				index++;
			} else {
				swap(index, element - 1, A);
			}
			
			
		} while(index < A.length);
		
		return Integer.MAX_VALUE;
		*/
		
		int max = 0;
		for (int i = 0; i < A.length; i++) {
			if (max < A[i]) {
				max = A[i];
			}
		}
		
		return (A.length == max ? 1 : 0);
	}
	
	/**
	 * 
	 * @param index1
	 * @param index2
	 * @param array
	 */
	private void swap(int index1, int index2, int array[]) {
		int tmp = array[index2];
		array[index2] = array[index1];
		array[index1] = tmp;
	}
}

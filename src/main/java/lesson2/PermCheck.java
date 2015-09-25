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
		
		int index = 0;
		do {

			int element = A[index];
		
			if ((element - 1) > (A.length - 1)) {
				return 0;
			}

			if (index == (element - 1)) {
				index++;
			} else {
				if (A[index] == A[element - 1]) {
					return 0; // repeated
				}
				
				swap(index, element - 1, A);
			}
			
		} while(index < A.length);
		
		return 1;
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

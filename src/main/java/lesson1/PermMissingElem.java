package lesson1;

/**
 * https://codility.com/programmers/task/perm_missing_elem
 * 
 * @author piotrek
 *
 */
public class PermMissingElem {
	
	/**
	 * 
	 * @param A
	 * @return
	 */
	public int solution(int[] A) {
		if (A == null || A.length == 0) {
			return 1;
		}
		
		if (A.length == 1 && A[0] != 1) {
			return 1;
		}
		
		int index = 0;
		int possible = -1;
		
		do {
			
			if (isCorrectElement(index, A)) {
				index++;
				continue;
			}
			
			if (isOutOfArray(index, A)) {
				possible = ++index;
				continue;
			}
			
			int secondIndex = buildCorrectIndexFromElement(index, A);
			swap(index, secondIndex, A);
			
		} while (index < A.length);
		
		if (possible > 0) {
			return possible;
		}
		
		return ++index;
	}
	
	/**
	 * 
	 * @param index
	 * @param array
	 * @return
	 */
	private int buildCorrectIndexFromElement(int index, int array[]) {
		return (array[index] - 1);
	}
	
	/**
	 * 
	 * @param index
	 * @param array
	 * @return
	 */
	private boolean isCorrectElement(int index, int array[]) {
		int element = array[index];
		
		return (element -1) == index;
	}
	
	/**
	 * 
	 * @param index
	 * @param array
	 * @return
	 */
	private boolean isOutOfArray(int index, int array[]) {
		int element = array[index];
		
		return element > array.length;
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

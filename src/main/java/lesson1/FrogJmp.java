package lesson1;

/**
 * https://codility.com/programmers/task/frog_jmp
 * 
 * @author piotrek
 *
 */
public class FrogJmp {
	
	/**
	 * 
	 * @param X
	 * @param Y
	 * @param D
	 * @return
	 */
	public int solution(int X, int Y, int D) {
		
		if ((Y - X) < 0) {
			return 0;
		};
		
		int remainder = (Y - X) % D;
		
		if (remainder == 0) {
			return ((Y - X) / D);
		}
		
		return ((Y - X) / D) + 1;
	}
}
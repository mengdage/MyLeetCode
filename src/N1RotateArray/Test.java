package N1RotateArray;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] num = {1, 2 , 3, 4, 5};
		int k = 3;
		s.rotate(num, k);
		System.out.println(Arrays.toString(num));
		
	}
	
}

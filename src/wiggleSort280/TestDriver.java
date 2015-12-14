package wiggleSort280;

import java.util.Arrays;

public class TestDriver {
	public static void main(String[] args) {
		int[] nums = {2, 1,4,2,3,6,7};
		System.out.println(Arrays.toString(nums));
		Solution s = new Solution();
		s.wiggleSort3(nums);
		System.out.println(Arrays.toString(nums));
	}

}

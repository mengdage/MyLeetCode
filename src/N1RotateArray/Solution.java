package N1RotateArray;

public class Solution {

	public void rotate(int[] nums, int k) {
		int n = nums.length;
		int temp;
        for(int i = 0; i < k; i++) {
            temp = nums[n-1];
            for(int j = n-2; j >= 0; j--) {
                nums[j+1] = nums[j];
            }
            nums[0] = temp;
        }
	}
}

package rangeSumQuery1D;

import java.util.Arrays;

public class Solution {
    int[] psum;
    public Solution(int[] nums) {
        int len = nums.length;
        if(len==0) return;
        psum = new int[len+1];
        //psum[0]=nums[0];
        for(int i = 1; i<= len; i++)
        {
            psum[i] = nums[i-1]+psum[i-1]; 
            
        }
        
    }

    public int sumRange(int i, int j) {
        //if(i==0)
        //    return psum[j];
        //else
        return psum[j+1]-psum[i];
    }
    
    public static void main(String[] args) {
    	int[] v = {1,2,3,4};
		Solution s = new Solution(v);
		System.out.println(s.sumRange(1, 3));
	}
}

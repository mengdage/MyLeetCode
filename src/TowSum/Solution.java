package TowSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index12 = new int[2];
        int lenNum = nums.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
        boolean isFound = false;
        for(int i = 0; i<lenNum && !isFound; i++)
        {
            int comp = target - nums[i];
            if(map.containsKey(comp))
            {
                index12[0] = i+1;
                index12[1] = map.get(comp);
                isFound = true;
            }
            map.put(nums[i], i+1);
        }
        return index12;
        
    }
    
    public static void main(String[] args) {
		int[] num = {3,2,4};
		int target = 6;
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.twoSum(num, target)));
	}
}

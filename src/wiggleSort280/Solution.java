package wiggleSort280;

public class Solution {
	public void wiggleSort(int[] nums) {
        boolean biggerthan = false;
        
        for(int i =0; i < (nums.length-1); i++)
        {
            boolean success = false;
            //find an element that is smaller/bigger than num[i] 
            //and put it in num[i+1]
            for(int j = i+1; j < nums.length && !success; j++)
            {
                if((nums[i] > nums[j]) == biggerthan )
                {
                	if(j != i+1)
                	{
	                    nums[i+1] += nums[j];
	                    nums[j] = nums[i+1]-nums[j];
	                    nums[i+1] = nums[i+1] - nums[j];
                	}
                	biggerthan = !biggerthan;
                    success = true;
                }
            }
            //if not success
            //change num[i+1] and num[i]
            if(!success)
            {
                nums[i] += nums[i+1];
                nums[i+1] = nums[i]-nums[i+1];
                nums[i] = nums[i] - nums[i+1];
                
                biggerthan = !biggerthan;
            }
            
        }
    }
	
	public void wiggleSort2	(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            if ((i % 2 == 1 && nums[i] < nums[i - 1]) || (i % 2 == 0 && nums[i] > nums[i - 1])) {
                int tmp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = tmp;
            }
    }
	
	public void wiggleSort3(int[] nums) {
        boolean smallerEqual = true;
        
        for(int i =0; i < (nums.length-1); i++)
        {
        	if((nums[i] <= nums[i+1]) != smallerEqual )
        	{
        		nums[i] += nums[i+1];
                nums[i+1] = nums[i]-nums[i+1];
                nums[i] = nums[i] - nums[i+1];
        	}
        	smallerEqual = !smallerEqual;
            
        }
    }

}

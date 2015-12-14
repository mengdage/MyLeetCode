package medianOfTwoSortedArray;

public class Solution {
	public double findMedianSortedArray(int[] num1, int[] num2)
	{
		int m = num1.length;
		int n = num2.length;
		
		//make sure num1 is shorter than num2
		if(m>n)
		{
			int[] temp = num1;
			num1 = num2;
			num2 = temp;
			
			m = m+n;
			n = m-n;
			m = m-n;
		}
		int ilower = 0;
		int iupper = m;
		int i= 0; 
		int j= 0;
		//double median = 0.0;
		// attention!!
		while(true)
		{
			i = (ilower+iupper)/2;
			j = (m+n)/2-i;
			// exclude the edging values: i ==0 or m
			if(i != m && num2[j-1] > num1[i])
			{
				ilower = i+1;
			}
			else if(i != 0 &&num1[i-1] > num2[j])
			{
				iupper = i-1;
			}else{
				if((m+n)%2 == 1)
				{
					
					return Math.min(num1[i], num2[j]);
				}
				else
				{
					return (Math.max(num1[i-1], num2[j-1])+Math.min(num1[i], num2[j]))/2.0;
				}
			}		
			
		}
	}



	public static void main(String[] args) {
		int[] num1 = {1, 2, 3};
		int[] num2 = {3,4, 5,6};
		Solution s = new Solution();
		double median = s.findMedianSortedArray(num1, num2);
		System.out.println(median);
	}
}

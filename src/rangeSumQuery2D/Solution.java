package rangeSumQuery2D;

import java.util.Arrays;

public class Solution {
    private int[][] m;
    public Solution(){}
    public Solution(int[][] matrix) {
        m = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int i=0, j=0;
        int sum = 0;
        for(i=row1; i<= row2; i++ )
        {
            for(j=col1; j<= col2; j++)
            {
                sum += m[i][j];
            }
        }
        return sum;
    }
    public void mat(){
    	int[] m1 = new int[5];
    	System.out.println(Arrays.toString(m1));
    }
    
    public static void main(String[] args) {
		
    	Solution s= new Solution();
    	s.mat();
	}
}

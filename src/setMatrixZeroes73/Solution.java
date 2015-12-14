package setMatrixZeroes73;

public class Solution {
    public void setZeroes(int[][] matrix) {
        int col = matrix[0].length;
        int row = matrix.length;
        
        int[] rowzeros = new int[row];
        for(int i = 0; i < row; i++)
            rowzeros[i] = 1;
        int[] colzeros = new int[col];
        for(int i = 0; i < col; i++)
            colzeros[i] = 1;
        
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(matrix[i][j] == 0)
                {
                    rowzeros[i] = 0;
                    colzeros[j] = 0;
                    
                }
            }
        }
        
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(rowzeros[i] == 0 || colzeros[j] == 0)
                {
                    matrix[i][j] =0;
                    
                }
            }
        }
        
        
        
    }
}
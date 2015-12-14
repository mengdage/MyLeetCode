package setMatrixZeroes73;

import java.util.Arrays;

public class TestDriver {
	public static void main(String[] args){
		/*
		int row = 5;
		int col = 6;
		int[][] t = new int[row][col];
		for(int i = 0; i < row; i++)
			for(int j =0; j< col; j++)
				t[i][j] = 1;
		t[1][1] = 0;
		t[3][3] = 0;
		for(int i = 0; i < row; i++)
			System.out.println(Arrays.toString(t[i]));
		System.out.println("----------------");
		Solution s = new Solution();
		s.setZeroes(t);
		for(int i = 0; i < row; i++)
			System.out.println(Arrays.toString(t[i]));
			*/
		int lower =1;
		double upper = 2000000000;
		int guess1 = (int)(upper-lower)/2+lower;
		double guess2 = (upper+upper)/2;
		
		
		System.out.println("guess1: " + guess1+ " guess2: "+guess2);
		/*
		while(guess1 >k)
		{
			System.out.println("guess1: " + guess1+ " guess2: "+guess2);
			if(k>guess1)
			{
				lower = guess1 + 1;
			}
			else {
				upper = guess1-1;
			}
			guess1 = (upper-lower)/2+lower;
			guess2 = (upper+lower)/2;
		}*/
		
		
		
	}
}

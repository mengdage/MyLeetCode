package myItoa;

public class Solution {
	public String myItoa(int in){
		String result = "";
		int sign=1;
		int digit = 0;
		//sign
		if(in < 0)
		{
			sign = -1;
			in = -1*in;
		}
		//get the last digit, put it in the front of the result
		while((digit=in%10) >0 || in/10>0)
		{
			char c = (char)('0'+digit);
			//String f = new String(c+"");
			result = c+result;
			in = in/10;
		}
		//put a optional sign before the result
		if(sign ==-1)
			result = '-' + result;
		return result;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		
		System.out.println(s.myItoa(-123));

	}
	
}

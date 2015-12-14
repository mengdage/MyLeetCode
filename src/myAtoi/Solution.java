package myAtoi;

public class Solution {
	public int myAtoi(String str) {
        if(str.length()==0||str == null) return 0;
        int result=0;
        int sign = 1;
        int outRange = 0;
        int itr = 0;
        char c;
        //1. remove leading white spaces
        while(itr<str.length() && (( str.charAt(itr)== ' ') || (str.charAt(itr)== '\t') ))
            itr++;
        //2. check if there is a sign
        if(itr<str.length() && (str.charAt(itr) == '+' || str.charAt(itr)=='-'))
        {
            if(str.charAt(itr) == '-')
                sign = -1;
            itr++;
        }
        //3. transform the following numbers to int
        //    3.1 check if overflow or underflow
        int maxTens = Integer.MAX_VALUE/10;
        int maxDigit = Integer.MAX_VALUE%10;
        if(sign == -1)
        {
            maxDigit = maxDigit+1;
        }
        
        while(itr<str.length() && ( (c=str.charAt(itr)) <='9' ) && ( c >= '0' ) )
        {
            int digit = c-'0';

            
            if(result > maxTens)
                outRange = sign;
            else if(result == maxTens && digit >maxDigit)
                outRange = sign;
            else
                result = result*10+digit;
                
            if(outRange == 1)
                return Integer.MAX_VALUE;
            else if(outRange == -1)
                return Integer.MIN_VALUE;
            itr++;
        }
        
        //
        return result*sign;
        
    }
	public static void main(String[] args) {
		Solution s = new Solution();
		s.myAtoi("123");
	}
}

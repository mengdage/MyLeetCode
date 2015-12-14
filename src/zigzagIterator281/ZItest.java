package zigzagIterator281;

import java.util.ArrayList;
import java.util.List;

public class ZItest {

	public static void main(String[] args){
		
		List<Integer> v1 = new ArrayList<Integer>();
		List<Integer> v2 = new ArrayList<Integer>();
		//3 4 5 6 7
		for(int i = 0; i < 5; i++)
			v1.add(i+3);
		//1 2 3
		for(int i = 0; i < 3; i++)
			v2.add(i+1);
		ZigzagIterator zi = new ZigzagIterator(v1, v2);
		while(zi.hasNext())
		{
			System.out.print(zi.next()+ " ");
		}
	}
}

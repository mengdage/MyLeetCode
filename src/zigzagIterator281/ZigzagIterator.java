package zigzagIterator281;

import java.util.Iterator;
import java.util.List;

public class ZigzagIterator {
	private List<Integer> ziV1, ziV2;
    private int ziLen1, ziLen2;
    private int pVector = 0; //point to the next vector
    private Iterator<Integer> it1, it2;

    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        ziV1 = v1;
        ziV2 = v2;
        it1 = v1.iterator();
        it2 = v2.iterator();
        ziLen1 = v1.size();
        ziLen2 = v2.size();
        
    }
//0 2 4
//0 1 2 3
//1 3 5 6
    public int next() {
        int result = 0;
        if(pVector == 0)
        {
            result = it1.next();
            if(it2.hasNext())
            {
                pVector = 1;
            }
            else
            {
                pVector = 0;
            }
        }
        else
        {
            result = it2.next();
            if(it1.hasNext())
            {
                pVector = 0;
            }
            else
            {
                pVector = 1;
            }
        }
        
        return result;
        
    }

    public boolean hasNext() {
        if(pVector == 0)
        {
            return it1.hasNext();
        }
        else
        {
            return it2.hasNext();
        }
        
    }

}

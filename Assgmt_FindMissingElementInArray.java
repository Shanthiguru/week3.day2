package week3.day2.AbstractInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assgmt_FindMissingElementInArray {

	public static void main(String[] args) 
	{
		int[]num= {2,3,6,7,1,5,8,9,10,2,5,6,10};
        Set<Integer> numb=new TreeSet<Integer>();
        for (int i = 0; i < num.length; i++) 
        {
        	numb.add(num[i]);
        }  
       System.out.println("Array with unique numbers:"+numb);
        List<Integer>dnum=new ArrayList<Integer>(numb);
        for (int i=1; i < dnum.size();i++)
        {
            if(i!=dnum.get(i-1)) 
            {
                System.out.println("Missing number in Array is:"+i);
                break;
            }
        }

	}
}

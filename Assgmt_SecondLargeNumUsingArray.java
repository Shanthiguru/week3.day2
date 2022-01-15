package week3.day2.AbstractInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assgmt_SecondLargeNumUsingArray {

	public static void main(String[] args) 
	{
		Integer[] i = {3,2,11,4,6,7};
		List<Integer> num=Arrays.asList(i);
		Collections.sort(num);
		int seclar=num.get(i.length-2);
		System.out.println(seclar);

	}

}

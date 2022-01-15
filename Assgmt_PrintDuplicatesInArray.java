package week3.day2.AbstractInterface;

import java.util.Arrays;

public class Assgmt_PrintDuplicatesInArray {

	public static void main(String[] args) 
	{
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20,12};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) 
		{
			if(arr[i]==arr[i+1]) 
			{
				System.out.println("Duplicate number: "+arr[i]);
			}
		}

	}

}

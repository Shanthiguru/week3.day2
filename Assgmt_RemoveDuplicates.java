package week3.day2.AbstractInterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class Assgmt_RemoveDuplicates 
{

	public static void main(String[] args) 
	{
		String name="We learn java basics as part of java sessions in java week1";
		int count=0;
		String[]s=name.split(" ");
		Set<String>dname=new LinkedHashSet<String>();
		for (String r :s ) 
		{
			dname.add(r);
			if(count>1) 
				{
					System.out.println();
				}    
		}

		System.out.println(dname);
	}
}



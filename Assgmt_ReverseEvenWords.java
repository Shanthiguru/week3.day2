package week3.day2.AbstractInterface;

public class Assgmt_ReverseEvenWords {

	public static void main(String[] args) 
	{
		String test = "I am a software tester";
		String[] chr = test.split(" ");
		for(int i = 0; i<chr.length ; i++) 
		{
			String s = chr[i];
			int len = chr[i].length();
			if(((i+1)%2)==0 ) 
			{
				for(int j = (len-1);j>=0;j--) 
				{
				  System.out.print(chr[i].charAt(j));
				}
			}
			else 
			{
					System.out.print(s);
			}
			System.out.print(" ");
		}

	}

}

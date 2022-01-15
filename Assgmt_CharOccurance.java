package week3.day2.AbstractInterface;

public class Assgmt_CharOccurance {

	public static void main(String[] args) 
	{
		
		String str = "welcome to chennai element";
		int count = 0;
		char rep='e' ;
		char[] c= str.toCharArray();
		int len=c.length;
		System.out.println(len);
			for(int i=0;i<=len-1;i++) 
			{
				if(str.charAt(i)==rep)
				{
				count++;
				}
			}
		System.out.println(count);
						
	}

}

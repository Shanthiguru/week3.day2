package week3.day2.AbstractInterface;

public class Assgmt_FindTypes {

	public static void main(String[] args) 
	{
		String test = " $$ Welcome to 2 nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		for(int i=0;i<=test.length()-1;i++) 
		{
			if(Character.isLetter(test.charAt(i)))
			{
				letter++;
			}
			
			else if(Character.isDigit(test.charAt(i))) 
			{
				num++;
				
			}
			else if(Character.isSpaceChar(test.charAt(i))) 
			{
				space++;
			}
			else 
			{
				specialChar++;
			}
		}
		System.out.println("Letter: " + letter);
		System.out.println("Space: " + space);
		System.out.println("Number: " + num);
		System.out.println("SpecialCharcter: " + specialChar);
		
	}

}

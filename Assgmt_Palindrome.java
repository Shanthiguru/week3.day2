package week3.day2.AbstractInterface;

public class Assgmt_Palindrome {

	public static void main(String[] args) 
	{
		String inp = "Madam";
		String rev = "";
		for(int i = inp.length()-1;i>=0;i--)
		{
			rev = rev + inp.charAt(i);
		}
		if (inp.equalsIgnoreCase(rev))
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Given string is not palindrome");
		}
		

	}

}

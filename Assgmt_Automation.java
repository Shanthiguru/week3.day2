package week3.day2.AbstractInterface;

public class Assgmt_Automation extends Assgmt_MultipleLangauge
{

	public static void main(String[] args) 
	{
		Assgmt_Automation auto = new Assgmt_Automation();
		auto.Java();
		auto.Selenium();
		auto.ruby();
		auto.python();

	}

	public void Java() 
	{
		System.out.println("Java from Language Interface");		
		
	}

	public void Selenium() 
	{
		System.out.println("Selenium from TestTool Interface");		
		
	}

	@Override
	public void ruby() 
	{
		System.out.println("Ruby from Abstract class");		
		
	}

}

package Practice;

public class CountOccuranceOfCharacter 
{

	public static void main(String[] args) 
	{
		String str="Java is Object Oriented Programming Language";
		
		int result=str.length()-str.replaceAll("m","").length();
		System.out.println(result);
	}

}

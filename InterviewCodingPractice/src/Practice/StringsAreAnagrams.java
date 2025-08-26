package Practice;

import java.util.Arrays;

public class StringsAreAnagrams {

	public static void main(String[] args) {
		
		String str1="listen",str2="silent";
		if(str1.length()!=str2.length())
			System.out.println("Strings are not anagrams");
		else
		{
			char[] ch1=str1.toLowerCase().toCharArray();
			char[] ch2=str2.toLowerCase().toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2))
			{
				System.out.println("Strings are anagrams");
			}
			else
			{
				System.out.println("Strings are not anagrams");
			}
				
				
		}

	}

}

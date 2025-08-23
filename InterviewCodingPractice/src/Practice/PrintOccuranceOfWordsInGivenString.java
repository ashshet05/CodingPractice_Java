package Practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintOccuranceOfWordsInGivenString 
{

	public static void main(String[] args) 
	{
		String str="   I Love Love Coding and and and Learning Learning Learning  ";
		Map<String, Integer> map=new LinkedHashMap<String, Integer>();
		Integer count=1;
		
		String[] word=str.toLowerCase().trim().split(" ");
		for(int i=0;i<word.length;i++)
		{
			if(!map.containsKey(word[i]))
				map.put(word[i], count);	
			else
				map.put(word[i],map.get(word[i])+1);
			
		}
		
		for(String w:map.keySet())
		{
			System.out.println("The count of word: "+w+"= "+map.get(w));
		}

	}

}

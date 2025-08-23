package Practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintOccuranceOfWordsInGivenString 
{

	public static void main(String[] args) 
	{
		String str="   I Love Love Coding and and and Learning Learning Learning  ";
		
		//Use HashMap or LinkedHashMAP for storing Words and counts
		Map<String, Integer> map=new LinkedHashMap<String, Integer>();
		//Count should be initialized to 1
		Integer count=1;
		
		String[] word=str.toLowerCase().trim().split(" ");//Convert given String into array of Strings using split()
														  //trim(): removes leading and trailing spaces
		
		//System.out.println(word.length);
		for(int i=0;i<word.length;i++)
		{
			if(!map.containsKey(word[i])) //If map does not contain key insert the key and count will be 1
				map.put(word[i], count);	
			else
				map.put(word[i],map.get(word[i])+1);//If map contains the key insert and increase count by fetching previous count value
													//map.put(key, value) → In a HashMap, if the key already exists, it overrides (updates) the old value with the new one.
												    //If the key does not exist, it creates a new entry with that key and value.	
		}
		
		//print the values
		for(String w:map.keySet())
		{
			System.out.println("The count of word: "+w+"= "+map.get(w));
		}

	}

}

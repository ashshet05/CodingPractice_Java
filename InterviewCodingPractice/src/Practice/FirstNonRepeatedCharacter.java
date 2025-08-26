package Practice;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.LinkedHashMap;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) 
	{
		//String str="swiss"; //only w is the only first non repeated character
		String str="programming";
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		Integer count=1;
		
		for(int i=0;i<str.length();i++)
		{
			if(!map.containsKey(str.charAt(i)))
				map.put(str.charAt(i), count);
			else
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
		}
		
		//to print first non-repeated character
		for(Entry<Character,Integer> entry:map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println("First repeated character is : "+entry.getKey());
				break;
			}		
			
		}
		//to print second non-repeated character
		int countSecond=0;
		for(Entry<Character,Integer> ent:map.entrySet())
		{
			if(ent.getValue()==1)
				countSecond++;
			if(countSecond==2)
			{
				System.out.println("Count of second repeated : "+ent.getKey());
				break;
			}
				
		}
		

	}

}

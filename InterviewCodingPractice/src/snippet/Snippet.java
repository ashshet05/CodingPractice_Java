package snippet;

public class Snippet {
	//print first non repeated character
	        String str="lalptop";
	        
	        char[] arr=str.toCharArray();
	        Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
	        Integer count=1;
	        for(int i=0;i<arr.length;i++)
	        {
	            if(!map.containsKey(arr[i]))
	            map.put(arr[i],count);
	            else
	            map.put(arr[i],map.get(arr[i])+1);
	        }
	        for(Character key:map.keySet())
	        {
	            if(map.get(key)==1)
	            {
	            System.out.println(key+" : "+map.get(key));
	            break;
	            }
	        }
	    } 
	    
	    
}


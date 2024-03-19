package CodingQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class DublicateCharInAStrin {
	
	public void findDublicate(String str)
	{
		char[] arr = str.toCharArray();
		HashMap<Character,Integer> mp = new HashMap<Character,Integer>();
		
		//One way of finding is Set
		Set<Character> st = new HashSet<Character>();
		
		for(int i = 0 ;  i < arr.length;i++)
		{
			if(!st.add(arr[i]))
			{
				System.out.println(arr[i]);
			}
		}
		
		//anotherway of doing is map

        for(int i = 0 ; i < arr.length ;i ++)
        {
        	if(mp.containsKey(arr[i]))
        	{
        		mp.put(arr[i], mp.get(arr[i])+1);
        	}
        	else
        	{
        		mp.put(arr[i], 1);
        	}
        }
        
        for(Entry<Character,Integer> en : mp.entrySet())
        {
        	if(en.getValue() >= 2)
        	{
        		System.out.println(en.getKey());
        	}
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DublicateCharInAStrin ob = new DublicateCharInAStrin();
		ob.findDublicate("RamantiShawh");

	}

}

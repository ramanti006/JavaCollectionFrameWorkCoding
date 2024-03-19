package CodingQuestions;

import java.util.HashMap;

public class FindOccuranceOfEachChar {
	
	public HashMap<Character,Integer> findOccurance(String str)
	{
       char[] arr = str.toCharArray();
        
        HashMap<Character,Integer> mp = new HashMap<Character,Integer>();
        
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
        
        return mp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindOccuranceOfEachChar ob = new FindOccuranceOfEachChar();
		System.out.println("Occurance of each char=>"+ob.findOccurance("kfkjshuifbfk"));
		
	}

}

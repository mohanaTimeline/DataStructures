package linkedlist;

import java.util.HashMap;

public class hsyy {

	public static void main(String[] args) {
	String[] arr1=new String[]{"rice","sugar","wheet","cheese"};int[] arr2=new int[]{11,22,33,44};int count=0;
	HashMap<String,Integer> hs=new HashMap<String,Integer>();	HashMap<String,Integer> hs1=new HashMap<String,Integer>();
	String[] arr3=new String[]{"rice","wheet"};int[] arr4=new int[]{11,33};
	for(int i=0;i<arr1.length;i++)
	{
		hs.put(arr1[i], arr2[i]);
	}for(int i=0;i<arr3.length;i++)
	{
		hs1.put(arr3[i], arr4[i]);
	}for(int i=0;i<arr3.length;i++)
	{
		if(hs.containsKey(arr3[i]))
		{
			if(hs.get(arr3[i])==hs1.get(arr3[i]))count++;
		}
	}System.out.println(count);
	}

}

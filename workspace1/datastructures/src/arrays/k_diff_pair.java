package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class k_diff_pair {

	public static void main(String[] args) {
	int[] nums=new int[] {3, 1, 4, 1, 5,7,8};
	HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
	int k=2;
	for(int i=0;i<nums.length-1;i++)
		
	{
		for(int j=i+1;j<nums.length;j++)
		{
			if((nums[i]-nums[j])==k)
{	hs.put(nums[i],nums[j]);}
			if((nums[i]-nums[j])==-k) hs.put(nums[j], nums[i]);
				
		}
	}   for (Map.Entry<Integer, Integer> entry : hs.entrySet()) {
	    System.out.println(entry.getKey()+" : "+entry.getValue());
	}

	}

}

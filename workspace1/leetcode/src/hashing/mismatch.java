package hashing;

import java.util.HashSet;

public class mismatch {

	public static void main(String[] args) {int sum=0;
		int a[]=new int[] {1,2,2,4};int x=0;
		int n=a.length;HashSet<Integer> st=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(!st.add(a[i]))
			{
				x=a[i];
			}
		}Integer[] arr = st.toArray(new Integer[st.size()]);
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}System.out.print(x +" ");
System.out.print(((n*(n+1))/2)-sum);
}}

package javacode;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;;

public class shuffle {

	public static void main(String[] args) {
		int[] arr=new int[]{2,6,9,4,1,7};
		List<Integer> li=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			li.add(arr[i]);
		}
		Collections.shuffle(li);System.out.println(Collections.min(li));
	}

}

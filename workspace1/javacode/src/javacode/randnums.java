package javacode;

import java.util.Arrays;
import java.util.Random;

public class randnums {

	public static void main(String[] args) {int max=50;int min=1;
		Random rand = new Random();for(int i=0;i<20;i++){      String Str = new String("Welcome to Tutorialspoint.com");
		System.out.println(Str.substring(8));
		int randomNum = rand.nextInt((max - min) + 1) + min;
		System.out.println(randomNum);}
	}

}

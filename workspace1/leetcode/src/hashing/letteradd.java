package hashing;
import java.util.*;
public class letteradd {

	public static void main(String[] args) {
	String s="abcd";char res=0;
	//char res;
	String t ="abcde";
	char c = 0;
	for (int i = 0; i < s.length(); ++i) {
		c ^= s.charAt(i);
	}
	for (int i = 0; i < t.length(); ++i) {
		c ^= t.charAt(i);
	}System.out.println(c);
	}

}

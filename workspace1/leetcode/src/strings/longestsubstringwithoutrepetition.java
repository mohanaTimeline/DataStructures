package strings;

import java.util.HashSet;

public class longestsubstringwithoutrepetition {

	public static void main(String[] args) {
	String str="abcabcbb";
	HashSet<Character> hs=new HashSet<Character>();
	int i=0;int j=0;int max=0;
	while(j<str.length())
	{
		if(!hs.contains(str.charAt(j)))
		{
			hs.add(str.charAt(j++));
			max=Math.max(max, hs.size());
		}else{
			hs.remove(str.charAt(i++));
		}
	}System.out.println(max);
	}

}

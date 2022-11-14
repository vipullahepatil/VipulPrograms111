/*
6. Given an array of strings, return the longest common prefix that is shared amongst all 
strings.
7. Note: you may assume all strings only contain lowercase alphabetical characters.
Ex: Given the following arrays...
["colorado", "color", "cold"], return "col"
["a", "b", "c"], return ""
["spot", "spotty", "spotted"], return "spot"
*/

import java.util.*;

class SplQuestion6
{
	public static void main(String args[])
	{
		String str1="colorado";
		String str2="color";
		String str3="cold";
		
		
		
		char[] str4=new char[str1.length()];
		for(int i=0 ; i<str1.length() && i<str2.length() && i<str3.length() ; i++)
		{
			if(str1.charAt(i)==str2.charAt(i) && str1.charAt(i)==str3.charAt(i))
			{
				str4[i]=str1.charAt(i);
			}
		}
		String str=String.valueOf(str4);
		System.out.println(str);
	}
}
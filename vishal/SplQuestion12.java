/*
12.  Given a string, s, return the total number of substring within s that contain the same 
character
*/

import java.util.*;

class SplQuestion12
{
	static void findNumbers(String s)
	{
		int n = s.length();

		int count = 1;
		int result = 0;

		int left = 0;
		int right = 1;
	
		while (right < n)
		{
			if (s.charAt(left) == s.charAt(right))
			{
				count++;
			}
			else
			{
				result += count * (count + 1) / 2;	
				left = right;
				count = 1;
			}
	
			right++;
		}
		result += count * (count + 1) / 2;
	
		System.out.println(result);
	}

	public static void main (String[] args)
	{
		String s = "bbbcbb";

		findNumbers(s);
	}
}



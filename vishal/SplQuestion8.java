/*
8. Given a string and the ability to delete at most one character, return whether or not it can 
form a palindrome.
*/

import java.util.*;

class SplQuestion8
{
	static boolean isPalindrome(String str,
					int low, int high)
	{
		while (low < high)
		{
			if (str.charAt(low) != str.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
	}
	
	static int possiblePalinByRemovingOneChar(String str)
	{
		int low = 0, high = str.length() - 1;
		
		while (low < high)
		{
			if (str.charAt(low) == str.charAt(high))
			{
				low++;
				high--;
			}
			else
			{
				
				if (isPalindrome(str, low + 1, high))
					return low;

				if (isPalindrome(str, low, high - 1))
					return high;
				return -1;
			}
		}

		return -2;
	}


	public static void main(String[] args)
	{
		String str = "abecbea";
		int idx = possiblePalinByRemovingOneChar(str);

		if (idx == -1)
			System.out.println("Not Possible");
		else if (idx == -2)
			System.out.println("Possible without " +
						"removing any character");
		else
			System.out.println("Possible by removing" +
							" character at index " + idx);
	}
}

/*
10. Given a string representing your stones and another string representing a list of jewels, 
return the number of stones that you have that are also jewels.
Ex: Given the following jewels and stones...
jewels = "abc", stones = "ac", return 2
jewels = "Af", stones = "AaaddfFf", return 3
jewels = "AYOPD", stones = "ayopd", return 0
*/

import java.util.*;

class SplQuestion10
{
	public static void main(String args[])
	{
		String jewels="abc";
		String stones="ac";
		int count=0;
		for(int i=0 ; i<jewels.length() ; i++)
		{
			for(int j=0 ; j<stones.length() ; j++)
			{
				if(jewels.charAt(i)==stones.charAt(j))
				{
					count++;
				}
			}
		}
		System.out.println(count);
		count=0;
	}
}
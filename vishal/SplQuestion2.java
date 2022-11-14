/*2. This question is asked by Google. Given a string, return whether or not it uses 
capitalization correctly. A string correctly uses capitalization if all letters are capitalized, 
no letters are capitalized, or only the first letter is capitalized.
Ex: Given the following strings...
"USA", return true
"Calvin", return true
"compUter", return false
"coding", return true*/

import java.util.*;

class SplQuestion2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		boolean capitalized=false;
			
		for(int i=s1.length()-1 ; i>0 ; i--)
		{
			if(s1.charAt(0)>='a' && s1.charAt(0)<='z')
			{
				System.out.println("1");
				capitalized=true;
				if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
				{
					capitalized=false;
					System.out.println("2");
					break;
				}					
			}
			else if(s1.charAt(0)>='A' && s1.charAt(0)<='Z' && s1.charAt(s1.length()-1)>='A' && s1.charAt(s1.length()-1)<='Z')
			{
				System.out.println("1");
				capitalized=true;
				if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
				{
					capitalized=false;
					System.out.println("2");
					break;
				}					
			}
			else if(s1.charAt(0)>='A' && s1.charAt(0)<='Z')
			{
				capitalized=true;
				if(s1.charAt(i)>='A' && s1.charAt(i)<='Z' && i!=0)
				{
					capitalized=false;
					System.out.println("2");
					break;
				}
			}
		}
		
		System.out.println(capitalized?"true":"false");
	}
}
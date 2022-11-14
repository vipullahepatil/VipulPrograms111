/*
3. This question is asked by Amazon. Given a string representing the sequence of moves a 
robot vacuum makes, return whether or not it will return to its original position. The 
string will only contain L, R, U, and D characters, representing left, right, up, and down 
respectively.
Ex: Given the following strings...
"LR", return true
"URURD", return false
"RUULLDRD", return true
*/
import java.util.*;

class SplQuestion3
{
	public static void main(String args[])
	{
		int horizontal=0;
		int vertical=0;
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		for(int i=0 ; i<str.length() ; i++)
		{
			if(str.charAt(i)=='L')
			{
				horizontal--;
			}
			else if(str.charAt(i)=='R')
			{
				horizontal++;
			}
			else if(str.charAt(i)=='U')
			{
				vertical++;
			}
			else if(str.charAt(i)=='D')
			{
				vertical--;
			}
		}
		
		if(horizontal==0 && vertical==0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
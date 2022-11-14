/*
11)
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F
*/

class LogAssign11
{
	public static void main(String args[])
	{
		for(int i=6 ; i>=1 ; i--)
		{
			char x='A';
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(x++ +" ");
			}
			System.out.println();
		}
		for(int i=1 ; i<=6 ; i++)
		{
			char x='A';
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(x++ +" ");
			}
			System.out.println();
		}
	}
}
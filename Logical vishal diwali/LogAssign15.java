/*
15)
1 2 3 4 5 6 
 2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6 
	 
*/

class LogAssign15
{
	public static void main(String args[])
	{
		for(int i=1 ; i<=6 ; i++)
		{
			int x=i;
			for(int j=1 ; j<i ; j++)
			{
				System.out.print(" ");
			}
			for(int j=6 ; j>=i ; j--)
			{
				System.out.print(x++ +" ");
			}
			System.out.println();
		}
	}
}
	 
/*
4)
     1 
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
 */
class LogAssign4
{
	public static void main(String args[])
	{
		
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=5 ; j>i ; j--)
			{
				System.out.print(" ");
			}
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}
}
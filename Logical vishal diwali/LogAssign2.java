/*
2)
*********
 *     *
  *   *
   * * 
	*
*/

class LogAssign2
{
	public static void main(String args[])
	{
		for(int i=1 ; i<10 ; i++)
		{
			System.out.print("*");
		}
		System.out.println();
		for(int i=5 ; i>1 ; i--)
		{
			for(int j=5 ; j>=i ; j--)
			{
				System.out.print(" ");
			}
			for(int j=1 ; j<(2*i)-2 ; j++)
			{
				if(j==1 || j==(2*i)-3)
				System.out.print("*");
				else
				System.out.print(" ");			
			}
			System.out.println();			
		}
		
	}
}
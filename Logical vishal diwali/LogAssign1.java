/*
1)
    * 
   * *
  *   *
 *     *
********* 
*/

class LogAssign1
{
	public static void main(String args[])
	{
		for(int i=1 ; i<5 ; i++)
		{
			for(int j=i ; j<5 ; j++)
			{
				System.out.print(" ");
			}
			for(int j=1 ; j<(2*i) ; j++)
			{
				if(j==1 || j==(2*i)-1)
				System.out.print("*");
				else
				System.out.print(" ");
				
			
			}
			System.out.println();			
		}
		for(int i=1 ; i<10 ; i++)
		{
			System.out.print("*");
		}
	}
}
/*
23)
1010101
0101010
1010101
0101010
1010101
0101010
1010101
*/

class LogAssign23
{
	public static void main(String args[])
	{
		for(int i=1 ; i<=7 ; i++)
		{
			
			for(int j=1 ; j<=7 ; j++)
			{
				if(((i%2)+(j%2))==2 || ((i%2)+(j%2))==0)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}
	
}
/*
7)
10101
01010
10101
01010
10101


*/




class LogAssign7
{
	public static void main(String args[])
	{
		for(int i=1 ; i<=5 ; i++)
		{
			
			for(int j=1 ; j<=5 ; j++)
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
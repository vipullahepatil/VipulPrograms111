/*
6)

1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1

*/




class LogAssign6
{
	public static void main(String args[])
	{
		for(int i=1 ; i<=5 ; i++)
		{
			int a=i;
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(a-- +" ");
			}
			System.out.println();
		}
	}
	
}
/*
19)
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1
*/



class LogAssign19
{
	public static void main(String args[])
	{
		for(int i=1 ; i<=7 ; i++)
		{
			int a=i-1;
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(j+" ");
			}
			for(int j=2 ; j<=i ; j++)
			{
				System.out.print(a-- +" ");
			}
			System.out.println();
		}
	}
	
}
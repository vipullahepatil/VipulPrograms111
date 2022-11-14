class DiwaliAssgPattern4
{
	public static void main(String[] args)
	{
		int x=1;
		for(int i=1;i<=5;i++)
		{
			String s=Integer.toString(x);
			char ch[]=s.toCharArray();
			x=x*11;
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print(ch[j]+" ");	
			}
			System.out.println();
			
			
		}
	}
}
/*
     1 
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
*/
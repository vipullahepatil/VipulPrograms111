class DiwaliAssgPattern7
{
	public static void main(String[] args)
	{
		String x=Integer.toBinaryString(21);
		String y=Integer.toBinaryString(10);
		for(int i=1;i<=5;i++)
		{
			if(i%2!=0)
			{
				System.out.println(x);
				
			}
			else
			{
				System.out.println("0"+y);
			}
			
		}
	}
}
/*
10101
01010
10101
01010
10101
*/
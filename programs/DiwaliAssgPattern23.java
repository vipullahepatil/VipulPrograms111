import java.util.*;

class DiwaliAssgPattern23
{
	public static void main(String[] args)
	{
		String x=Integer.toBinaryString(85);
		String y=Integer.toBinaryString(42);
		for(int i=1;i<=7;i++)
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
1+4+16+64=85
32+8+2=42
1010101
0101010
1010101
0101010
1010101
0101010
1010101
 


*/
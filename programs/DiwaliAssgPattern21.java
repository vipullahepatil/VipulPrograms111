import java.util.*;

class DiwaliAssgPattern21
{
	static void display(List<Integer> list)
	{
		for(Integer x:list)
		{
			System.out.print(x);
		}
	}
	public static void main(String[] args)
	{
		List<Integer> list=new ArrayList<>();
		list.add(1);
		for(int i=1;i<=7;i++)
		{
			if(i%2!=0)
			{
				display(list);
				list.add(0);
				System.out.println();
			}
			else
			{
				display(list);
				list.add(1);
				System.out.println();
			}
		}
	}
}
/*
1
10
101
1010
10101
101010 
1010101


*/
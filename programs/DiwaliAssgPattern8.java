import java.util.*;
class DiwaliAssgPattern9
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
		
		//list.add(1);
		List<Integer> list=new ArrayList<> ();
		
		for(int i=0;i<5;i++)
		{
			
			if(i%2==0)
			{
				list.add(1);
				display(list);
				
			}
			else
			{
				list.add(0);
				display(list);
				
			}
			System.out.println();			
		}
	
	}
}
/*
1
10
101
1010
10101
*/
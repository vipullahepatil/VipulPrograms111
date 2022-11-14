class RemoveElementFromLinkedList
{
	Node head;
	static class Node
	{
		Node next;
		int data;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	RemoveElementFromLinkedList()
	{
		head=null;
	}
	int length()
	{
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
		}
		return count;
	}
	void insertAtBet(int position,int data)
	{
		
		if(position<=0 || position >length()+1)
		{
			System.out.println("Enter valid index");
			return;
		}
		Node temp=new Node(data);
		if(position==1)
		{
			temp.next=head;
			head=temp;
		}
		else
		{
			Node current=head;
			int count =1;
			while(count<position-1)
			{
				current=current.next;
				count ++;
			}
			temp.next=current.next;
			current.next=temp;
		}
	}
	void display()
	{
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
			
		}
		
	}
	void replace(int position ,int data)
	{
		if(position<=0 || position >length()+1)
		{
			System.out.println("Enter valid index");
			return;
		}
		Node temp=new Node(data);
		if(position==1)
		{
			head.data=temp.data;
		}
		else
		{
			Node current=head;
			int count =1;
			while(count<position)
			{
				current=current.next;
				count ++;
			}
			current.data=temp.data;
		}
	}
	public static void main(String[] args)
	{
		RemoveElementFromLinkedList r1=new RemoveElementFromLinkedList();
		r1.insertAtBet(1,10);
		r1.insertAtBet(2,20);
		r1.insertAtBet(3,30);
		r1.insertAtBet(4,40);
		r1.insertAtBet(5,50);
		r1.insertAtBet(3,25);
		
		r1.display();
		System.out.println("------------------------");
		r1.replace(3,555);
		r1.display();
		
	}
}

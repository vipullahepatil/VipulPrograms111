import java.util.*;

class HashIteration
{
	static void display(Set h)
	{
		Iterator it=h.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[] args)
	{
		Set h=new HashSet();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(50);
		display(h);
	}
}
/*import java.util.*;
import java.util.Iterator;
  public class Exercise2 {
  public static void main(String[] args) {
         // Create a empty hash set
     HashSet<String> h_set = new HashSet<String>();
   // use add() method to add values in the hash set
          h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");
          h_set.add("White");
          h_set.add("Pink");
          h_set.add("Yellow");

  // set Iterator 
    Iterator<String> p = h_set.iterator();
  // Iterate the hash set
   while (p.hasNext()) {
   System.out.println(p.next());
   }
   }
}*/
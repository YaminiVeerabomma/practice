package Arrays;
import java.util.*;

public class RevesreArrayList {
public  static void main(String[] args) {
	 ArrayList<Integer> a = new ArrayList<Integer>();	
	a.add(1);
	a.add(5);
	a.add(4);
	a.add(6);
	System.out.println(a);
	a.add(1, 3);
	System.out.println(a);
	System.out.println(a.size());
	
	List<Integer> c=new ArrayList<Integer>();
	
	for(int i=2;i<a.size();i++)
	{
		c.add(a.get(
				i));
	}
	System.out.println(c);
	
	
	
	
     ArrayList<Integer> b = new ArrayList<Integer>();	
     for (int i = a.size() - 1; i >= 0; i--) {
    	 b.add(a.get(i));
    	 
     }
     System.out.println(b); 

	

	

	}

}

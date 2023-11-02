import java.util.List;
import java.util.LinkedList;

public class ListInterface {
  public static void main(String[] args) {
    
	List<Integer> il=new LinkedList<Integer>();
	List<String> sl=new LinkedList<String>();

	il.add(1);// adding elements

	il.add(1,2); // adding element at particular index

	System.out.println(il);

	System.out.println(il.get(0)); // getting / accesing the element at specified index

	sl.add("Hi");
	sl.add(1,"Hello");
	
	System.out.println(sl);
	sl.remove("Hi"); 
	System.out.println("After removing element which is at Hi\n"+sl);
	
	

	

	
  }
}
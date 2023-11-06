import java.util.LinkedList;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.Scanner;
public class FindingElementInLinkedList
{
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);

        LinkedList<Integer> numberList= new LinkedList<>();
	
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
	numberList.add(4);
        numberList.add(5);
        numberList.add(6);

        System.out.println("Enter a number to find");

        int number=sc.nextInt();
        if(numberList.contains(number)){
            System.out.println("Number :"+number+" is present in List");
        }
        else{
            System.out.println("Number :"+ number + is not present");
        }
        
        
	}
}
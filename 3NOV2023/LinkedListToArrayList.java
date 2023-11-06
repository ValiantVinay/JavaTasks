import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class LinkedListToArrayList {
    public static void main (String []args){
        List<Integer> numberList=new LinkedList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        ArrayList<Integer> copiedList=new ArrayList<>(numberList);
        System.out.println("Linked List "+numberList);
        System.out.println("Array List  "+copiedList);
        System.out.println("Size Initially "+copiedList.size());
        copiedList.trimToSize();
        System.out.println("Size Afterwards "+copiedList.size());

    }
}

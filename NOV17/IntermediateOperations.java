package NOV17;

import java.util.ArrayList;
import java.util.List;
class Employee{
    int n;
    Employee(int n){
        this.n=n;
    }
}

public class IntermediateOperations {
    public static void main(String[] args) {
        ArrayList<Employee> numbersList = new ArrayList<> ();
        numbersList.add (new Employee (2));
        numbersList.add (new Employee (3));
//        numbersList.stream ().forEach (System.out::println);
        List<Employee> newList = numbersList.stream()
                .map(n->n).toList ();
        System.out.println(newList);
    }
}

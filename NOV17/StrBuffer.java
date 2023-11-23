package NOV17;

import java.util.ArrayList;
import java.util.List;

public class StrBuffer {
    public static void main(String[] args) {
        String s="String";
        StringBuilder sb= new StringBuilder (s);
        System.out.println (sb.reverse ());

        ArrayList<Integer> arrLst = new ArrayList<> ();
        arrLst.add (1);
        arrLst.add(3);

        // Streams Methods or Functions
        // forEach
        arrLst.stream ().forEach (System.out::println);
    }
}

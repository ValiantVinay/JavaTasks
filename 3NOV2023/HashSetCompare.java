import java.util.HashSet;
import java.util.Set;
public class HashSetCompare {
    public static void main(String []args){
        Set<String> nameSet1=new HashSet<>();
        Set<String> nameSet2=new HashSet<>();
        nameSet1.add("Vinay1 ");
        nameSet1.add("Vinay2 ");
        nameSet1.add("Vinay3 ");
        nameSet2.add("Vinay1 ");
        nameSet2.add("Vinay2 ");
        nameSet2.add("Vinay3 ");

        if(nameSet1.equals(nameSet2)){
            System.out.println("Both are Same");
        }
        else{
            System.out.println("Both are not Same");
        }
        if(nameSet1.containsAll(nameSet2)){
            System.out.println("nameSet2 is subset of nameSet2");
        }
        else{
            System.out.println("nameSet2 is not a subset of nameSet1");
        }

        for (String s:nameSet1){
            System.out.println(s);
        }
        for (String s:nameSet2){
            System.out.println(s);
        }

    }
}

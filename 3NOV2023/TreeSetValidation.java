import java.util.Set;
import java.util.TreeSet;
public class TreeSetValidation {
    public static void main(String []args){
        Set<Integer> numberSet=new TreeSet<>();
        numberSet.add(2);
        numberSet.add(1);
        numberSet.add(5);
        numberSet.add(3);
        numberSet.add(8);
        numberSet.add(1);
        for (int n:numberSet ){
            if(n<7){
                System.out.println("Number :"+n+" is less than 7");
            }
        }
    }
}

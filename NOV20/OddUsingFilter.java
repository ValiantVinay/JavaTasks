package NOV20;
import java.util.ArrayList;
import java.util.List;

public class OddUsingFilter {
    public static void main(String[] args) {

        List<Integer> oddNumbers= new ArrayList<> ();
        for( int i=0;i<20;i++){
            oddNumbers.add(i);
        }
        for( int i=0;i<20;i++){
            oddNumbers.add(i);
        }
        List<Integer> finalList = oddNumbers.stream ().distinct ().filter (i-> {
            if (i%2!=0) {
                return true;
            }
            else{
                return false;
            }

        }).toList ();

        System.out.println (finalList);

    }
}

package NOV18;

import Past.Example;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

class StreamExample{
    int number;
    String name;
    @Override
    public String toString() {
        return this.number +" "+this.name;
    }
    public StreamExample(int number, String name){
        this.name= name;
        this.number=number;
    }
}
public class OperationsOnListOfNumbers {
    public static void main(String[] args) {

        List<Integer> listOfNumbers = new ArrayList<> ();
        listOfNumbers.add (11);
        listOfNumbers.add (2);
        listOfNumbers.add (3);
        List<String> listOfStrings = new ArrayList<> ();
        listOfStrings.add ("One");
        listOfStrings.add ("Two");
        listOfStrings.add ("Three");

        //distinct filter map sorted
        List<Integer> listOfNumbersStream = listOfNumbers.stream ().distinct ().sorted ().map(n->n*2).filter (n->n>4).toList ();
        List<String> listOfStringsStream = listOfStrings.stream ().limit (2).skip(2).filter (n->n.startsWith ("T")).toList ();
        System.out.println (listOfNumbersStream);
        System.out.println (listOfStringsStream);

        // objects as elements in list
        List<StreamExample> ObjectList = new ArrayList<StreamExample> ();
        ObjectList.add ( new StreamExample(1,"name1"));
        ObjectList.add ( new StreamExample(2,"name2"));
        ObjectList.add ( new StreamExample(3,"name3"));

        List<StreamExample> StreamExampleListStream = ObjectList.stream ().toList ();
        System.out.println(StreamExampleListStream);
    }
}
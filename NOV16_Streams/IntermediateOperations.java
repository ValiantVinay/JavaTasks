package NOV16_Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class IntermediateOperations {
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<> ();
        al.add("anand");
        al.add("ANagaSai");
        al.add("Mani");
        al.add("Avinay");
        List<String> filteredAndUppercaseWords = al.stream()
                        .map(word ->{
                            if(word.startsWith ("A" )||word.startsWith ("a" )){
                                return word.toUpperCase ();
                            }
                            else{
                                return word;
                            }
                        }).toList ();


        System.out.println(filteredAndUppercaseWords);

    }
}

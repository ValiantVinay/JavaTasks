//package NOV16_Streams;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class SameElementsUsingStreams {
//    public static void main(String[] args) {
//        List<Integer> list1 = new ArrayList<> ();
//        List<Integer> list2 = new ArrayList<> ();
//        list1.add (1);
//        list1.add (2);
//        list1.add (3);
//        list2.add (1);
//        list2.add (2);
//        list2.add (3);
//        list2.add (4);
//
////        List<Integer> final_List = list1.stream ().filter (list2::contains).toList ();
//        List<Integer> filteredAndUppercaseWords = list1.stream()
//                .map(word ->{
//                    if(word.startsWith ("A" )||word.startsWith ("a" )){
//                        return word.toUpperCase ();
//                    }
//                    else{
//                        return word;
//                    }
//                }).toList ();
//        System.out.println(final_List);
//    }
//}

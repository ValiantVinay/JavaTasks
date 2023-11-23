package NOV22;
import java.io.*;
import java.util.*;

public class ReadCSV{
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\av229\\Documents\\Java Files\\NewCSV.csv");
        Map<String,Double> map = new HashMap<>();
        Map<String,Integer> countMap = new HashMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line ;
            br.readLine();
            while((line = br.readLine()) != null){
                String[] arr = line.split(",");
                String genre = arr[2];
                System.out.println (arr[3]);
                Double rating = Double.parseDouble(arr[3]);
                if(map.containsKey(genre) && countMap.containsKey(genre)){
                    countMap.put(genre,countMap.get(genre)+1);
                    map.put(genre, map.get(genre)+rating);
                }
                else{
                    map.put(genre, rating);
                    countMap.put(genre, 1);
                }
            }
            File file2 = new File("C:\\Users\\av229\\Documents\\Java Files\\text.txt");
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(file2))) {
                for (Map.Entry<String, Double> value : map.entrySet()) {
                    bw.write(value.getKey() + " = " + value.getValue() / countMap.get(value.getKey())+"\n");
                }
            }
        }catch(IOException e){
            System.out.println(e);
        }
        System.out.println (map);
        System.out.println (countMap);
    }
}

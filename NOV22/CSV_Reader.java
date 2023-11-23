package NOV22;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CSV_Reader {
    public static void main(String[] args) {
        // creating the instances of csv file and resultant text file
        File resultFile = new File ("C:/Users/av229/Documents/Java Files/Result.txt");
        File csv_file = new File ("C:/Users/av229/Documents/Java Files/Books.csv");
        Map<String,Float> genre_rating = new HashMap<> ();
        //Reading from the csv file and printing each genre and its average rating it in output
        try {
            Scanner sc = new Scanner (csv_file);
            String firstLine = sc.nextLine ();
            while(sc.hasNextLine ()){
                String []temp = sc.nextLine ().split (",");
                System.out.println (temp[2]+" "+temp[3]);
                if(genre_rating.containsKey (temp[2])){
                    float f = genre_rating.get(temp[2]);
                    genre_rating.put(temp[2],(Float.parseFloat (temp[3])+f)/2);
                }else{
                    genre_rating.put(temp[2],Float.parseFloat (temp[3]));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println ("Exception in Reading CSVFile");
        }catch (Exception e){
            System.out.println ("Unknown Exception in Reading CSVFile");
        }
        // finally writing that data into a text file
        try {
            BufferedWriter bw = new BufferedWriter ( new FileWriter (resultFile));
            genre_rating.entrySet().stream()
                    .forEach(element -> {
                        try {
                            bw.write("Genre          -- >" + element.getKey()
                                    + "\nAverage Rating -- >" + element.getValue());
                            bw.write ("\n");
                        } catch (IOException e) {
                            throw new RuntimeException (e);
                        }
                    });
            bw.flush ();
            bw.close ();
        } catch (IOException e) {
            System.out.println ("Exception in result file creation");
        }
    }
}
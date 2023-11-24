package NOV22;
import java.io.*;
import java.util.Scanner;
public class Student_CSV {
    public static void main(String[] args) throws IOException {
        File file = new File ("C:/Users/av229/Documents/Java Files/Students.csv");
        Scanner sc = new Scanner (file);
        String ignore = sc.nextLine ();
        File write_file = new File ("C:/Users/av229/Documents/Java Files/Student_Result.txt");
        BufferedWriter bw = new BufferedWriter (new FileWriter (write_file));
        while(sc.hasNextLine ()){
            String []line = sc.nextLine ().split (",");
            bw.write ("Name of Student :"+line[0]
                    +" Average Marks --->"+
                    ( Integer.parseInt(line[1]) + Integer.parseInt(line[2]) + Integer.parseInt(line[3]))/3 +"\n");
            System.out.println ("Name of  Student :"+line[0]
                    +" Average Marks --->"+
                    ( Integer.parseInt(line[1]) + Integer.parseInt(line[2]) + Integer.parseInt(line[3]))/3  );
        }
        bw.close ();


    }
}
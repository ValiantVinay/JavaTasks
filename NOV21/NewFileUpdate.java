package NOV21;

import java.io.*;
import java.util.Scanner;

public class NewFileUpdate {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\av229\\Documents\\Java Files\\TextFile.txt";
        File file= new File (path);
        file.createNewFile ();


        Scanner sc= new Scanner (file);

        String oldData="";
        String newData=" New Data";

        while(sc.hasNextLine ()){
            String temp=sc.nextLine();
            oldData+=temp;
        }

        BufferedWriter bw = new BufferedWriter (new FileWriter (file));
        bw.write(oldData+newData);
        bw.close ();


    }
}

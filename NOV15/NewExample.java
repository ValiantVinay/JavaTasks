package NOV15;

import java.io.*;

public class NewExample {
    public static void main(String[] args) throws IOException {
        File file= new File ("C:\\Users\\av229\\Documents\\Java Files\\CreatedDoc.txt");
        file.createNewFile ();
        BufferedWriter bw= new BufferedWriter (new FileWriter (file));
        bw.append ("Hello i am vinay");
        bw.flush ();
        BufferedReader br= new BufferedReader (new FileReader (file));
        String line;
        while((line=br.readLine ())!=null){
            System.out.println(line);
        }

    }
}

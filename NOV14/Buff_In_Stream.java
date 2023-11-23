package NOV14;

import java.io.*;

public class Buff_In_Stream {
    public static void main(String[] args) throws IOException {
        File file= new File ("C:/Users/av229/Documents/Java Files/CreatedDoc.txt");

        BufferedInputStream bis = new BufferedInputStream (new FileInputStream("C:/Users/av229/Documents/Java Files/CreatedDoc.txt"));
        int i=bis.read();
        System.out.println("First Char:"+(char)i);

        while(i!=-1){
            System.out.print((char)i);
            i=bis.read();
        }
        bis.close ();
    }
}

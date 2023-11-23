package NOV22;

import java.io.File;
import java.io.IOException;

public class RenameFileGame extends Thread {
    public static void main(String[] args) throws IOException, InterruptedException {
        File file = new File ("C:/Users/av229/Documents/Java Files/Starting.txt");

        file.createNewFile ();


        for(int i=0;i<10;i++){
            String s = Integer.toString (9-i);
            File temp_file = new File ("C:/Users/av229/Documents/Java Files/"+s+".txt");
            Thread.sleep (500);
            file.renameTo (temp_file);
            Thread.sleep (500);
            file =  new File ("C:/Users/av229/Documents/Java Files/"+s+".txt");

            System.out.println (i);
        }
        File temp_file2 = new File ("C:/Users/av229/Documents/Java Files/Completed.txt");
        file.renameTo (temp_file2);

    }
}

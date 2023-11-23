package NOV17;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BasicOperations {
    public static void main(String[]args)throws Exception  {
        File file = new File("C:\\Users\\av229\\Documents\\Java Files\\Old.txt");
        file.createNewFile();

        BufferedReader br= new BufferedReader (new FileReader (file));


        BufferedWriter bw= new BufferedWriter ( new FileWriter (file));
        BufferedWriter bw2= new BufferedWriter ( new FileWriter (file));
        bw.write ("Hello");
        bw.write (" ");
        bw.append ("Its Coming Manidhar");
        bw.close ();


        File NewFile= new File ("C:\\Users\\av229\\Documents\\Java Files\\New.txt");
        NewFile.createNewFile ();
        String line;
        while((line=br.readLine())!=null){
            bw2.write (br.readLine ());
        }
        bw2.close ();







//        FileWriter fw = new FileWriter(file);
//        BufferedWriter bw = new BufferedWriter(fw);
//        bw.write("Creatd a File name with Krish");
//        bw.close ();
//        File fw1 = new File("C:\\Users\\av229\\Documents\\Java Files\\NewLocation\\krishna.txt");
//        file.renameTo(fw1);
//
//
//        File copyFile= new File ("C:\\Users\\av229\\Documents\\Java Files\\NewLocation\\Valiant.txt");
//        copyFile.createNewFile ();

        

    }
}

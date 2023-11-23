package NOV15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;


public class InputName {
    public static void main(String[] args) throws IOException {
        File file = new File ("C:\\Users\\av229\\Documents\\Java Files\\File.txt");
        File file2 = new File ("C:\\Users\\av229\\Documents\\Java Files\\NewFile.txt");
        file.createNewFile ();

//        file.compareTo (file2);
        Files.move (Paths.get("C:\\Users\\av229\\Documents\\Java Files\\File.txt"), Paths.get("C:\\Users\\av229\\Documents\\Java Files\\NewLocation\\NewFile.txt"), StandardCopyOption.REPLACE_EXISTING);
        file.renameTo (file2);
        System.exit (0);
    }
}

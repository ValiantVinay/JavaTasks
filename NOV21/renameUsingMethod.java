package NOV21;
import java.io.*;
import java.util.Scanner;

class RenameFile{
    public static void renameFile(String filePath, String newFileName) throws IOException {

        File file = new File (filePath);
        file.createNewFile ();
        String []path=filePath.split ("/");
        int len= path.length;
        System.out.println (len);
        String newPath="";
        for(int i=0;i<len-1;i++){
            newPath+=path[i]+"/";
        }
        newPath = newPath+newFileName+".txt";
        System.out.println (newPath);
        File newFile = new File (newPath);
        file.renameTo (newFile);
    }
}

public class renameUsingMethod {
    public static void main(String[] args) throws IOException {
        Scanner sc =  new Scanner (System.in);
        System.out.println ("Enter New File Name");
        String newFileName = sc.next ();

        RenameFile rf = new RenameFile ();
        rf.renameFile ("C:/Users/av229/Documents/Java Files/nagFile.txt",newFileName);
    }

}
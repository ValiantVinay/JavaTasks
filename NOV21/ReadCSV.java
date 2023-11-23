package NOV21;
import java.io.*;

public class ReadCSV {
    public static void main(String[] args) {

        String [][]data = { {"1 1","1 2","1 3"},{"2 1","2 2","2 3"}  };

        try{
            File file = new File ("C:\\Users\\av229\\Documents\\NewCSV.csv");
            BufferedReader br = new BufferedReader (new FileReader (file));
            String line;
            while((line=br.readLine())!=null){
                String []value = line.split (",");
                System.out.println (" ID is : "+value[1]+", NAME :"+value[0]);
            }
            br.close ();
        }catch(IOException i){
            System.out.println("This is a InputOutput Exception");
        }





    }
}

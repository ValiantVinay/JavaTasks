package NOV15;
import java.io.*;
import java.util.Scanner;

public class FileInputTypes {
    // BufferReader
    // BufferInputStream
    // DataInputStream
    public static void main(String[] args) throws IOException{
        File file = new File ("C:\\Users\\av229\\Documents\\Java Files\\FileInputTypes.txt");
        System.out.println ("Writing some text into file using BufferedWriter");
        BufferedWriter bw = new BufferedWriter (new FileWriter (file));
        bw.append ("Example text");
        bw.flush ();





        //use try catch here
        BufferedReader br = new BufferedReader (new FileReader (file));
        System.out.println("Reading File Using BufferedReader");
        //reading whole document using the buffered reader
        String line;
        while((line=br.readLine ())!=null){
            System.out.println(line);
        }

        //reading using BufferedInputStream
        System.out.println("Reading File Using BufferedInputStream");
        FileInputStream fis= new FileInputStream (file);
        FileOutputStream fos= new FileOutputStream (file);
        BufferedInputStream bis = new BufferedInputStream (fis);


        ///////////////////////////
        DataInputStream dataIn = new DataInputStream(fis);


        int count = fis.available();

        byte[] bs = new byte[count];

        dataIn.read(bs, 0,count);

        System.out.println("Using Data Input Stream");
        for (byte by : bs) {
            char c = (char) by;
            System.out.print(c);
        }
        ///////////////////////////



        int n;
        while((n=bis.read ())!=-1){
            System.out.print((char)n);
        }

//        // reading using DataInputStream
//        System.out.println("Reading file using DataInputStream ");
//        DataOutputStream dos = new DataOutputStream (fos);
//        dos.writeInt (2);
//        dos.writeBoolean (true);
//
//        DataInputStream dis = new DataInputStream (fis);
//        int number=dis.readInt ();
//        boolean b=dis.readBoolean ();
//        System.out.println("INT :"+number);
//        System.out.println("Boolean :"+b);
//
//
//        ////////////////////////////

        System.out.println("This is Data Input Stream");

        File file2= new File ("C:\\Users\\av229\\Documents\\Java Files\\NewDataText.txt");
        InputStream is = new FileInputStream(file2);

        DataInputStream dis = new DataInputStream(is);

        int count2 = is.available();

        byte[] bs2 = new byte[count2];

        dis.read(bs2, 0,count2);

        for (byte b : bs2) {
            char c = (char) b;

            if (b == 0){
                c = ' ';
            }
            System.out.print(c);
        }
    }





    }


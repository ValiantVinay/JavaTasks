package NOV14;

import java.io.*;

public class Input_Streams {
    public static void main(String[] args) {
        // File name
        String fileName = "C:/Users/av229/Documents/Java Files/CreatedDoc.txt";

        // Read file using BufferedReader
        readUsingBufferedReader(fileName);

        // Read file using BufferedInputStream
        readUsingBufferedInputStream(fileName);

        // Read file using DataInputStream
        readUsingDataInputStream(fileName);
    }

    // Read file using BufferedReader
    private static void readUsingBufferedReader(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Reading file using BufferedReader:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Read file using BufferedInputStream
    private static void readUsingBufferedInputStream(String fileName) {
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fileName))) {
            System.out.println("Reading file using BufferedInputStream:");
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Read file using DataInputStream
    private static void readUsingDataInputStream(String fileName) {
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)))) {
            System.out.println("Reading file using DataInputStream:");
            while (dataInputStream.available() > 0) {
                System.out.print(dataInputStream.readUTF());
            }
            System.out.println("\n");
        } catch (IOException e) {
            e.printStackTrace ();
            System.out.println ("End of file exception occurred");
        }
    }
}
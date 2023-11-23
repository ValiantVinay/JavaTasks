package NOV22;
//         Question
//         Assume you have a CSV file (books.csv) with the following format:
//
//        Title                     Author                  Genre       Rating
//        The Great Gatsby          F. Scott Fitzgerald     Classic     4.5
//        To Kill a Mockingbird     Harper Lee              Fiction     4.8
//
//        Write a Java program that reads this CSV file, calculates the average rating
//        for each genre, and writes the genre names along with their average ratings
//        to another text file (results.txt).

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CSV_File_Operations {
    public static void main(String[] args){

        //Lists to store and make calculations
        Map<String,Float> generes_ratings_map = new HashMap<> ();
        //Creating File Instances
        File BooksFile = new File ("C:\\Users\\av229\\Documents\\Java Files\\Books.csv");
        File ResultFile = new File ("C:\\Users\\av229\\Documents\\Java Files\\results.txt");

        // Creating results file
        try{
            ResultFile.createNewFile ();
        }catch(IOException ioe){
            System.out.println ("It's an IOException in results file creation");
        }catch (Exception e){
            System.out.println ("It's an Unknown Exception in results file creation");
        }

        // Reading 7the data from the books file
        try{
            Scanner sc= new Scanner (BooksFile);
            while(sc.hasNextLine ()){
                String []values = sc.nextLine ().split (",");
                String genere = values[2];
                String rating = values[3];
                System.out.println (genere);
            }
        // catching IOException and Exception
        }catch (IOException ioe) {
            System.out.println ("IOException in books file while reading data");
        }catch (Exception e){
            e.printStackTrace ();
            System.out.println ("It's an Unknown Exception in books file while reading data");
        }
        //printing map
        System.out.println (generes_ratings_map);


    }
}

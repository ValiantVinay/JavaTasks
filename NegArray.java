import java.util.Scanner;

public class NegArray {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int arrSize=sc.nextInt();
        try{
            int []arr=new int[arrSize];
            System.out.println("Array Size is Created with size:"+arrSize);
        }
        catch(Exception e){
            System.out.println("Array size cant be negative");
        }
    }
}

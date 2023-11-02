import java.util.Scanner;
import java.util.InputMismatchException;
public class Exceptions {
    public static void main(String []args){
        //Exception handling
        //ArrayIndexoutofBounds
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
        scanner.close();

        try {
	    int n=1/0;
            
        } catch (Exception e) {
            System.out.println("Invalid its arithmetic exception");
        }

    }
}

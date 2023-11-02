import java.util.InputMismatchException;
import java.util.Scanner;
class Action{
    public boolean isValidOperator(String operator) {
        return operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("%");
    }
    public Action(){
        Scanner sc=new Scanner(System.in);
        double result=0.0;
        try{
            System.out.println("Enter the operand 1");
            double operand1=sc.nextDouble();
            System.out.println("Enter the operand 2");
            double operand2=sc.nextDouble();
            System.out.println("Enter operator :");
            String operator=sc.next();
            if(isValidOperator(operator)){
                if(operator.equals("+")){
                    result=operand1+operand2;
                }
                if(operator.equals("-")){
                    result=operand1-operand2;
                }
                if(operator.equals("*")){
                    result=operand1*operand2;
                }
                if(operator.equals("/")){
                    result=operand1/operand2;
                }
                if(operator.equals("%")){
                    result=operand1%operand2;
                }
            }
            System.out.println("Result "+operand1+" "+operator+" "+operand2+" is :"+result);
        }
        catch(InputMismatchException i){
            System.out.println("Enter valid input type");
        }
        catch(ArithmeticException a){
            System.out.println("Division by Zero Exception");
        }
    }
}
public class Calculator {
    public static void main(String []args){
        Action ac=new Action();
    }
}
import java.util.Scanner;

class BankAccount{
    private int accNo;
    private double balance;
    private String accHolName;
    private double reqAmt;

    public BankAccount(int accNo,double balance,String accHolName){
        this.accNo=accNo;
        this.balance=balance;
        this.accHolName=accHolName;
        this.reqAmt=1000;
        System.out.println("Account Number is :"+accNo+" Account Holder Name :"+accHolName);
    }
    public void deposit(double amt){
        if(amt>0){
            balance+=amt;
            System.out.println("Amount deposited :"+amt);
            System.out.println("Current Balance :"+balance);
        }
        else{
            System.out.println("Enter Valid Amount to deposit");
        }
    }

    public void withdraw(double amt2){
        if(amt2>balance){
            System.out.println("Insufficient Balance");
            System.out.println("Entered amount is :"+amt2+" Which is higher than your balance :"+balance);
        }
        else if(balance-amt2<reqAmt){
            System.out.println("Minimum balace of "+reqAmt+" Should be there ");
            System.out.println("If you withdraw "+amt2+" The balance will be "+(balance-amt2)+" which is less than Minimum balance");
        }
        else if(amt2<=0){
            System.out.println("Enter Valid Amount it should be greater than 0 ");
        }
        else{
            balance-=amt2;
            System.out.println("Amount Withdrawn :"+amt2);
            System.out.println("Current Balance after Withdrawal :"+balance);
        }
    }

    public void getBalance(){
        System.out.println("Your Current Balance is :"+balance);
    }

}
public class Task9 {
    public static void main(String []args){
        BankAccount ba=new BankAccount(12,1000.0,"Shashi");
        ba.getBalance();
        ba.deposit(10000);
        ba.withdraw(2000);
        ba.withdraw(2000);
        System.out.println("\n");
        BankAccount ba2=new BankAccount(13,10000.0,"Valiant");
        ba2.getBalance();
        ba2.deposit(10000);
        ba2.withdraw(2000);
        ba2.withdraw(2000);
        ba2.getBalance();

    }
}

package NOV9;

class EvenThread implements Runnable{
    @Override
    public void run() {
        for(int i=2;i<=20;i=i+2){
            System.out.println("Even Number : "+i);
        }
    }
}
class OddThread implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=20;i=i+2){
            System.out.println("Odd Number : "+i);
        }
    }
}
public class One {
    public static void main(String[] args) {

        EvenThread et=new EvenThread ();
        OddThread ot= new OddThread ();
        Thread thread1=new Thread (et);
        Thread thread2=new Thread(ot);
        thread1.start ();
        thread2.start ();
    }
}

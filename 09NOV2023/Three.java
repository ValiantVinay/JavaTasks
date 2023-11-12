package NOV9;
class Process{
    int counter;
    synchronized void Increment(){
        counter++;
    }
}

public class Three {
    public static void main(String[] args) {
        Process p= new Process ();

        int counter=0;
        Thread t1= new Thread (new Runnable () {
            @Override
            public void run() {
                for (int i=0;i<10000;i++){
                    p.Increment ();
                }
            }
        }
        );
        Thread t2= new Thread (new Runnable () {
            @Override
            public void run() {
                for (int i=0;i<10000;i++){
                    p.Increment ();
                }
            }
        }
        );
        t1.start ();
        t2.start ();
        try{
            t1.join ();
//            t2.join ();
        }
        catch (InterruptedException i){
            System.out.println("InterruptedException Occurred");
        }

        System.out.println("The count is :"+p.counter);
    }
}
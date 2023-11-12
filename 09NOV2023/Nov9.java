package Week;
class Thread1 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread 1 Thread Started");
        try{
            Thread.sleep(2000);
//            Thread.wait(1000);
        }
        catch(InterruptedException i){
            System.out.println("Interrupted Exception Occurred in Thread1");
        }
        System.out.println("Thread 1 Ended");
    }
}
class Thread2 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread 2 Started");
        if(isInterrupted()) {
            System.out.println("Thread 1 Interrupted");
        }
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException i){
            System.out.println("Interrupted Exception Occurred in Thread2");
        }
        System.out.println("Thread 2 Ended");
    }
}
public class Nov9 {
    public static void main(String args[]){
        System.out.println("Past.Main Thread Started");
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        // Priority in Threads
        thread1.setPriority(1);
        thread2.setPriority(4);
        thread1.start();
        try {
            thread1.wait(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        thread2.start();




       thread1.interrupt();

        try{
            thread1.join();
        }
        catch(InterruptedException i){
            System.out.println("Exception Occurred");
        }
        System.out.println("Past.Main Thread Ended");

    }
}

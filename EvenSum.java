public class EvenSum {
    public static void main(String []args) {
        int n = 2;
        int Sum = 0;
        while (n <= 100) {
            Sum += n;
            n += 2;
            
        }
        System.out.println(Sum);
        //Another Method to solve with simple Formula as follows
        int Sum2=(50/2)*(2+100); // here n is a no of even numbers in range 2 is start even number and 100 is final even number
        System.out.println(Sum2);
    }
}
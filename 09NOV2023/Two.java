package NOV9;
class SortArray implements Runnable{
    @Override
    public void run(){
            int arr[]={2,3,1,2,5,6,2};
            int n = arr.length;
            boolean swapped;
            do {
                swapped = false;

                for (int i = 1; i < n; i++) {
                    // Swap if the element found is smaller than the previous element
                    if (arr[i - 1] > arr[i]) {
                        int temp = arr[i - 1];
                        arr[i - 1] = arr[i];
                        arr[i] = temp;
                        swapped = true;
                    }
                }
            } while (swapped);
        System.out.print("SortedArray is  :");
            for (int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
    }
}
public class Two {
    public static void main(String[] args) {
        SortArray sa=new SortArray ();
        Thread thread=new Thread (sa);
        thread.start ();

    }
}
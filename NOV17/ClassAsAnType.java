package NOV17;
import java.util.Arrays;

interface A{
    void dis();
    static void display(){
        System.out.println ("N");
    }

    default void New(){
        display ();
    }

}


public class ClassAsAnType {
    public static void main(String[] args) {
        A a= new A () {
            @Override
            public void dis() {
                System.out.println ("implemented");
            }
        };
        a.dis ();
        a.New ();

//        int arr[]={1,22,3,4};
//        Arrays.sort(arr);
//        for(int i:arr){
//            System.out.println (i);
//        }

    }
}

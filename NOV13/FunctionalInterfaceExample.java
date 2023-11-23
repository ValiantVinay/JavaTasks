package NOV13;

//Functional interface
interface FunctionalInterface{ // An interface which contains only single abstract method but
                                // can contain any no of default and static methods
    void absMethod();
    default void method1(){
        int n=10;
     }
    static void method2(){

    }
    // default method should have a body else gets an error

}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {

    }
}

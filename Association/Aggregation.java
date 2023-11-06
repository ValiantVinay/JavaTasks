import java.util.ArrayList;
class MyClass {
    String name="Vinay";
}
class MyClass2 extends MyClass{
    MyClass var;
    String name;
    ArrayList<String> Names=new ArrayList<>();
    void display(){
        Names.add(super.name);
        System.out.println(super.name);
    }
}

public class Aggregation {
    public static void main(String[] args) {
        MyClass2 obj=new MyClass2();
        obj.display();
        obj.display();
        System.out.println(obj.Names);
    }
}

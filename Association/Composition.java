package com.package1;
import java.util.ArrayList;

class MyClass {
    String name = "Vinay";
}

class MyClass2 extends MyClass {
    ArrayList<String> names = new ArrayList<>();

    void addNameToNames() {
        names.add(name);
    }

    void displayNames() {
        for (String n : names) {
            System.out.println(n);
        }
    }
}

public class Composition {
    public static void main(String[] args) {
        MyClass2 obj = new MyClass2();
        obj.addNameToNames();
	obj=null;
        obj.displayNames();
        System.out.println(obj.names);
    }
}


package com.package1;

public class Constructor {

    public Constructor(){
        System.out.println("Hello");
    }

    public Constructor(int n)
    {
        System.out.println("Number is :"+n);
    }

    public static void main(String []args)
    {
        Constructor c=new Constructor();
        Constructor c2=new Constructor(5);
    }

}

package com.package1;
import java.util.Collection;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Task11 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for index 0 :");
        int n1=sc.nextInt();
        System.out.println("Enter a number for index 1 :");
        int n2=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(n1);
        al.add(n2);
        System.out.println("Original array list "+al);
        Collections.swap(al,0,1);
        System.out.println("Swapped array list "+al);

        // cloning one array list and storing in another
        ArrayList<Integer> al2 = new ArrayList<Integer>(al);
        System.out.println("Cloned array List "+al2);
        //Method 2 using addAll
        ArrayList<Integer> al3 = new ArrayList<Integer>();
        al3.addAll(al);
        System.out.println("Cloned array List method 2 "+al2);

        // replace second element with the specified element
        System.out.println("Enter element to replace it with second element ");
        int num=sc.nextInt();
        int old=al2.get(1);
        System.out.println("Original array list :"+al2);
        al2.set(1,num);
        sc.close();
        System.out.println("Second element is :"+old);
        System.out.println("Replaced Second element is :"+al2.get(1));
        System.out.println("Array list after replacing a element at index 1 or second element is :"+al2);

    }
}
//1.Write a Java program that swaps two elements in an array list.
//        2.Write a Java program to clone an array list to another array list. // give first arraylist to another array list as parameter
                                                                                // or using addAll() method
//        3.Write a Java program to replace the second element of an ArrayList with the specified element.// using set method
                                                                                // list1.set(index, newElement);

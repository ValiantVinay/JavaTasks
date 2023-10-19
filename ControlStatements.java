package com.package1;

public class ControlStatements {

    public static void main(String []args){

        //control statements
        //Decision-making or conditional
        //if
        if(2==2){
            System.out.println("Same");
        }
        //else if
        else if(2>2){
            System.out.println("greater ");
        }
        //else
        else {
            System.out.println("Smaller ");
        }

        //looping statements
        //for
        for(int i=0;i<2;i++){
            System.out.println("for loop");
        }
        //for each
        int []arr={1,2,3};
        for (int i:arr){
            System.out.println(i);
        }
        //while
        int k=1;
        while(k<3){
            System.out.println("while loop");
            k++;
        }
        //do-while
        do{
            System.out.println("Do while");
            k++;
        }while(k<5);


        //Jumping statements
        //break
        System.out.println("Breaks at 3");
        for(int i=0;i<10;i++){
            System.out.println("Number is :"+i);
            if(i==3){
                break;
            }
        }
        // continue
        System.out.println("Continues/skips at 2");
        for(int i=0;i<4;i++){
            if(i==2){
                continue;
            }
            System.out.println("Number is :"+i);
        }


    }
}

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Studentt{
    Scanner sc=new Scanner(System.in);
    ArrayList<String> al=new ArrayList<String>();
    Map<String,Integer> map=new HashMap<>();
    public void addStudent(String T,int c){
        al.add(T);
        map.put(T,c);
    }
    public void removeStudent(int i){
        al.remove(i);
    }

    public void ReStu(){
        System.out.println("Enter name to Retrieve");
        String temp=sc.next();
        System.out.println("Student :"+temp+" Class :"+map.get(temp));
    }
    public void display(){
        System.out.println("Enter Your Choice");
        System.out.println("1. Add ");
        System.out.println("2. Remove ");
        System.out.println("3. Retrieve");
        System.out.println("4. Show All ");
        System.out.println("5. Stop ");
    }
    public void StudentList(){
        if(al.size()==0){
            System.out.println("Your List is Empty");
        }
        else{
            for(int i=0;i<al.size();i++){
                System.out.println(i+1+" "+" "+"Student :"+al.get(i)+" Class :"+map.get(al.get(i)));
            }
        }
    }


}

class StudentManagementSystem{

    public static void main(String []args){

        Studentt t=new Studentt();

        Scanner sc=new Scanner(System.in);
        t.display();

        boolean k=true;
        while(k)
        {
            int num=sc.nextInt();
            switch(num){
                case 1://Add
                    System.out.println("Enter Student Name");
                    String temp=sc.next();
                    System.out.println("Enter Student Class");
                    int cls=sc.nextInt();
                    System.out.println("Student "+temp+" Added Successfully ");
                    t.addStudent(temp,cls);
                    t.display();
                    break;
                case 2://Remove
                    System.out.println(t.al);
                    System.out.println("Enter  index to Remove it ");
                    int temp3=sc.nextInt();
                    t.removeStudent(temp3);
                    t.display();
                    break;
                case 3://Retrieve
                    t.ReStu();
                    t.display();
                    break;
                case 4: //Show All
                    System.out.println("all Details");
                    t.StudentList();
                    t.display();
                    break;
                case 5://Stop
                    System.out.println("Stopped!");
                    k=false;
                    break;
                default:
                    System.out.println("Enter Valid Option");
                    t.display();
                    break;
            }
        }



    }
}

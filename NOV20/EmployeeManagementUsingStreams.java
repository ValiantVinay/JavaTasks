package NOV20;
import java.util.*;
import java.util.stream.Stream;

class Employee{
    Scanner sc=new Scanner(System.in);
    List<String> al=new ArrayList<String>();
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
        System.out.println("Employee :"+temp+" ID :"+map.get(temp));
    }
    public void displayData(){
        Stream<Map.Entry<String, Integer>> finalMap = map.entrySet ().stream ().sorted ();
//        System.out.println(finalMap);
    }
    public void display(){
        System.out.println("Enter Your Choice");
        System.out.println("1. Add ");
        System.out.println("2. Delete ");
        System.out.println("3. Search");
        System.out.println("4. Show All ");
        System.out.println("5. Stop ");
    }
    public void StudentList(){
        if(al.size()==0){
            System.out.println("Your List is Empty");
        }
        else{
//            Collections.sort (al);
            List<String> sortedArray = al.stream ().sorted ().toList ();
            for(int i=0;i<al.size();i++){
                System.out.println(i+1+" "+" "+"Employee :"+sortedArray.get(i)+" ID :"+map.get(sortedArray.get(i)));
            }
        }
    }
}
class EmployeeManagementUsingStreams{
    public static void main(String []args){
        Employee t=new Employee();
        Scanner sc=new Scanner(System.in);
        t.display();
        boolean k=true;
        while(k)
        {
            int num=sc.nextInt();
            switch(num){
                case 1://Add
                    System.out.println("Enter Employee Name");

                    try{
                        String temp=sc.next();
                        System.out.println("Enter Employee ID");
                        int cls=sc.nextInt();
                        System.out.println("Employee "+temp+" Added Successfully ");
                        t.addStudent(temp,cls);
                        t.display();
                    }catch(InputMismatchException ime){
                        System.out.println("Enter Valid Data");
                    }
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
                    System.out.println("All Details");
                    t.StudentList();
                    t.display();
                    t.displayData();
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

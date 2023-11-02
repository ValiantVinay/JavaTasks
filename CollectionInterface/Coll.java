import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Student{
	private int rollNo;
	private String Name;
	private int branchId;

	ArrayList<String> al=new ArrayList<>();
	ArrayList<Integer> al2=new ArrayList<>();

	Map<Integer, String> mp=new HashMap<>();
	
	mp.put(new Integer(1),"English");
	//mp.put(2,"Science");


	Scanner sc=new Scanner(System.in);

	public Student(){
		this.rollNo=rollNo;
		this.Name=Name;
	}
	int getRollNo(){
		return rollNo;
	}
	String Name(){
		return Name;
	}

	public void addStudent(){
		System.out.println("Enter name");
		String name=sc.next();
		al.add(name);
		System.out.println("Enter Subject Code");
		int temp=sc.nextInt();
		al2.add(temp);
	}
	public void removeStudent(int i){
		al.remove(i);
	}
	
	public void showAll(){
		int s=al.size();
		for(int i=0;i<s;i++){
			System.out.println("Name :"+al.get(i)+" Subject :");
		}
	}

	public void display(){
		System.out.println("Enter Your Choice ");
		System.out.println("1 : Display All");
		System.out.println("2 : Add Student");
		System.out.println("3 : Remove All");
		System.out.println("4 : Stop");
	}

}


class Coll{
	public static void main(String []args){
		
		System.out.println("Student Management System");
		Student st=new Student();
		
		st.display();
		
		boolean k=true;
		while(k)
		{
			int num=sc.nextInt();
			switch(num){
				case 1: //Display Case
					System.out.println("Enter Task Name");
					String temp=sc.next();
					System.out.println("Task "+temp+" Added Succesfully ");
					st.addStudent(temp);
					st.display();
					break;
				case 2: // Add Case
					System.out.println(t.al);
					System.out.println("Enter task's index to mark it as Complete");
					int temp2=sc.nextInt();
					st.markComplete(temp2);
					st.display();
					break;
				case 3: // Remove Case
					System.out.println(t.al);
					System.out.println("Enter task's index to Remove it ");
					int temp3=sc.nextInt();
					st.removeTask(temp3);
					st.display();
					break;
				case 4: //Stop Case
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
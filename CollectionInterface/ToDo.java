import java.util.ArrayList;
import java.util.Scanner;

class To{
	
	ArrayList<String> al=new ArrayList<String>();
	ArrayList<String> al2=new ArrayList<String>();
	
	public void addTask(String T){
		al.add(T);
		al2.add("Pending");
	}
	public void removeTask(int i){
		al.remove(i);
		al2.remove(i);
	}
	public void markComplete(int n){
		al2.set(n,"Completed");
	}
	public void display(){
		System.out.println("Enter Your Choice");
		System.out.println("1. Add Task");
		System.out.println("2. Mark Task Completed");
		System.out.println("3. Remove Task");
		System.out.println("4. Show All Tasks");
		System.out.println("5. Show Completed Tasks");
		System.out.println("6. Stop ");
	}
	public void taskList(){
		if(al.size()==0){
			System.out.println("Your ToDo List is Empty");
		}
		else{
			for(int i=0;i<al.size();i++){
				System.out.println(i+" "+"Task :"+al.get(i)+" Status :"+al2.get(i));	
			}	
		}
	}
	public void completedTaskList(){
		for(int i=0;i<al.size();i++){
			if(al2.get(i)=="Completed"){
				System.out.println("Task :"+al.get(i)+" Status :"+al2.get(i));
			}
		}
	}
	
}

class ToDo{
	
	public static void main(String []args){
	
		To t=new To();
		
		Scanner sc=new Scanner(System.in);
		t.display();
		
		boolean k=true;
		while(k)
		{
			int num=sc.nextInt();
			switch(num){
				case 1:
					System.out.println("Enter Task Name");
					String temp=sc.next();
					System.out.println("Task "+temp+" Added Succesfully ");
					t.addTask(temp);
					t.display();
					break;
				case 2:
					System.out.println(t.al);
					System.out.println("Enter task's index to mark it as Complete");
					int temp2=sc.nextInt();
					t.markComplete(temp2);
					t.display();
					break;
				case 3:
					System.out.println(t.al);
					System.out.println("Enter task's index to Remove it ");
					int temp3=sc.nextInt();
					t.removeTask(temp3);
					t.display();
					break;
				case 4:
					System.out.println(t.al);
					t.taskList();
					break;
				case 5:
					System.out.println("Completed tasks are");
					t.completedTaskList();
					break;
				case 6:
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
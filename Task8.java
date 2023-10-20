//Explain implementationsCreate a class Employee with private fields for name, salary, and employee ID. 
// Use getter and setter methods to ensure that the salary cannot be set to a negative value. 
// Demonstrate encapsulation by creating employee objects, setting their information, and displaying it.

package com.package1;
class Employee2 {
    private String name;
    private double salary;
    private int employeeId;

    public Employee2(String name, double salary, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
        setSalary(salary);
    }
    double getSalary(){
        return salary;
    }
    String setName(){
        return name;
    }
    int setempID(){
        return employeeId;
    }
    public void setSalary(double salary) {
        this.salary = salary;
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary can't be negative");
        }
    }

    public void displayInfo() {
        System.out.println("Employee Employee ID :" + employeeId);
        System.out.println("Employee Name :" + name);
        System.out.println("Employee Salary :" + salary);
        System.out.println();
    }
}
public class Task8 {
    public static void main(String []args){
        Employee2 e1=new Employee2("Valiant ",20000,776);
        Employee2 e2=new Employee2("Ram ",50000,123);
        e1.displayInfo();
        e2.displayInfo();

        System.out.println(e1.getSalary());
    }
}

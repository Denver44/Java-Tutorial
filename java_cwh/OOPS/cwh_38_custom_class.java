package OOPS;

// In one java file there can be one access modifier

class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.print("My id is " + id);
        System.out.println(" and my name is "+ name);
    }
    public int getSalary(){
        return salary;
    }
}


public class cwh_38_custom_class {
    public static void main(String[] args) {

        System.out.println("Custom Class tutorial");
        Employee emp = new Employee(); // Instantiating a new object for our class.
        emp.id = 5;
        emp.name = "Harry";
        emp.salary = 34;

        System.out.print("My ID : " + emp.id);
        System.out.print(" and my Name : " + emp.name);
        System.out.println(" my salary is : "+ emp.salary);

        Employee john = new Employee(); // Instantiating a new Employee Object
        john.id = 17;
        john.salary = 12;
        john.name = "John Khan";

        // Printing the Attributes
        john.printDetails();
        int salary = john.getSalary();
        System.out.println("John salary is : "+salary);
    }
}

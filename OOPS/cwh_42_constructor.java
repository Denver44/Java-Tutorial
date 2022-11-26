package OOPS;

class MyNewEmployeeClass{
    private int id;
    private String name;

//    DEFAULT CONSTRUCTOR
    public MyNewEmployeeClass(){
        id = 0;
        name = "Your-Name-Here";
    }

    // PARAMETERIZED CONSTRUCTOR

    public MyNewEmployeeClass(String myName){
        id = 1;
        name = myName;
    }
    public MyNewEmployeeClass(String myName, int myId){
        id = myId;
        name = myName;
    }

//  SETTERS
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }

//    GETTERS
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}


public class cwh_42_constructor {
    public static void main(String[] args) {
        MyNewEmployeeClass emp1 = new MyNewEmployeeClass();
        emp1.setName("Varun");
        emp1.setId(34);

        System.out.println(emp1.getId());
        System.out.println(emp1.getName());

        MyNewEmployeeClass emp2 = new MyNewEmployeeClass("Vicky", 12);
        System.out.println(emp2.getId());
        System.out.println(emp2.getName());
    }
}



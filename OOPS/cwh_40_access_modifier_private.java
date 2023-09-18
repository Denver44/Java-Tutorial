package java_cwh.OOPS;

class MyEmployee{
    private int id;
    private String name;

    public void setId(int i){
        this.id = i;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}


public class cwh_40_access_modifier_private {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        // Below Code line throws an error due to private access modifier
        // harry.id = 45;
        // harry.name = "CodeWithHarry";

        harry.setId(234);
        harry.setName("CodeWithHarry");
        System.out.print("My ID : "+harry.getId());
        System.out.println(" my name is "+harry.getName());
    }
}




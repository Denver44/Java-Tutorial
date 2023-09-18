package statickeyword;

public class Student {

    static int count =0;
    String name;
    private byte age;
    int roll_number;

    // default constructor
    public Student(){
        count++;
    }

    public Student(String name, byte age, int roll_number){
        this.name=name;
        this.age=age;
        this.roll_number=roll_number;   
        count++; 
    }

    public byte getAge(){
        return this.age;
    }

    public void setAge(byte a){
        if(a<0){
            return;
        }

        this.age=a;
    }
	
    public void print(){

        System.out.println(this);

        System.out.println(this.name+" "+this.age+" "
        +this.roll_number);
    }

    public void print(Student s){

        System.out.println(this);

        System.out.println(this.name+" "+this.age+" "
        +this.roll_number);

        System.out.println(s);

        System.out.println(s.name+" "+s.age+" "
        +s.roll_number);
    }

    public static int getcount(Student s){
        int sum = s.age+s.roll_number;
        return count;
    }

    public int getcount(){
        return count;
    }
    
}

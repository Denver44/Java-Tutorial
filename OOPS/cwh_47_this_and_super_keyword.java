package java_cwh.OOPS;

class ClassA{
    int a;
    ClassA(int a){
        this.a = a;
    }

    public int getA() {
        return a;
    }
    public int returnNone(){
        return 1;
    }
}
class ClassB extends ClassA{
    ClassB(int c){
        super(c);
    System.out.println("I am a constructor");
    }
}

public class cwh_47_this_and_super_keyword {
    public static void main(String[] args) {
        ClassA e = new ClassA(65);
        ClassB d = new ClassB(5);
        System.out.println(e.getA()); }

}



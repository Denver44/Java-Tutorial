package OOPS;


abstract class AClass{
    public AClass(){
        System.out.println("I am Default constructor of A Class");
    }
    abstract public void greet();
    abstract public void welcomeMessage();

}

class BClass extends AClass{

    @Override
    public void greet(){
        System.out.println("Good morning");
    }

    @Override
    public void welcomeMessage(){
        System.out.println("Welcome to the competitive world");
    }
}

abstract class CClass extends BClass{
    public void healthState(){
        System.out.println("My Health State is good");
    }
}
class DClass extends CClass{
    public void currentState(){
        System.out.println("Current State is Okay");
    }
}

public class cwh_53_abstract_class {
    public static void main(String[] args) {
        //AClass a = new AClass(); -- error
        //CClass c = new CClass(); -- error
        BClass b = new BClass();
        b.greet();
        b.welcomeMessage();

        DClass d = new DClass();
        d.currentState();
        d.healthState();
    }
}

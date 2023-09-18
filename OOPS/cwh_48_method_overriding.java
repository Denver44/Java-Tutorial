package java_cwh.OOPS;

class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void printer(){
        System.out.println("I am printer of class A");
    }
}

class B extends A{
    @Override
    public void printer(){
        System.out.println("I am printer of class B");
    }

    public void newPrinter(){
        System.out.println("I am new printer  of class B");
    }
}

public class cwh_48_method_overriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.printer();
        b.printer();
    }
}

package java_cwh.OOPS;

interface parentAInterface{
    void meth1();
    void meth2();
}

interface parentBInterface{
    void meth3();
    void meth4();
}

// Here using extends keywords we can inherit interface to another interface.
interface childSampleInterface extends parentAInterface , parentBInterface  {
    void meth5();
    void meth6();
}
interface smallChildSampleInterface extends childSampleInterface  {
    void meth7();
    void meth8();
}

class MySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("method 1");
    }
    public void meth2(){
        System.out.println("method 2");
    }
    public void meth3(){
        System.out.println("method 3");
    }
    public void meth4(){
        System.out.println("method 4");
    }
    public void meth5(){
        System.out.println("method 5");
    }
    public void meth6(){
        System.out.println("method 6");
    }
    public void meth7(){
        System.out.println("method 7");
    }
    public void meth8(){
        System.out.println("method 8");
    }
}
public class cwh_58_inheritance_interface {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
        obj.meth5();
        obj.meth6();
        obj.meth7();
        obj.meth8();
    }
}


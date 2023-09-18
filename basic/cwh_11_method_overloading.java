package java_cwh.basic;

public class cwh_11_method_overloading {
    static void foo(){
        System.out.println("Good Morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }
    public static void main(String[] args) {
        foo();
        foo(3000);
        foo(3000, 4000);
    }
}

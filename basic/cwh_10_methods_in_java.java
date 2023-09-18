package java_cwh.basic;

// In java we call functions as methods.
// Normally the functions which are declared in class are called Method and here in java everything is in class only.
// Here we put static keyword in front of function so that we don't need to create an object the class

public class cwh_10_methods_in_java {
    static int logic(int x, int y) {
        if (x > y)
            return x + y;
        else
            return (x + y) * 5;
    }


    public static void main(String[] args) {
        int a = 5, b = 7;
        int c = logic(a, b);
        System.out.println(a + " " + b);

        // Method invocation using Object creation

        // cwh_11_methods_in_java obj = new cwh_11_methods_in_java();
        // int c = obj.logic(a, b);

        int x = 2,y = 1;
        int z = logic(x, y);
        System.out.println(z);
    }
}

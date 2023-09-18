package java_cwh.basic;

import java.util.*;

public class cwh_12_fundamentals_of_programming {

    public static void function_if_else() {
        int a = 29;
        if (a > 18)
            System.out.println("You can drive");
        else
            System.out.println("You are underage!");
    }

    public static void function_relational_and_logical_operators() {

        boolean a = true, b = false;

        System.out.println("For Logical &&...");

        if (a && b) System.out.println("Y");
        else System.out.println("N");

        System.out.println("For Logical ||...");

        if (a || b) System.out.println("Y");
        else System.out.println("N");

        System.out.println("Not operator !a and !b is " + a + " "+ b);
    }
    public static void function_if_elseif_else() {

        int age;
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age>56)System.out.println("You are experienced!");
        else if(age>46) System.out.println("You are semi-experienced!");
        else if(age>36)System.out.println("You are semi-semi-experienced!");
        else System.out.println("You are not experienced");

    }

    public static void function_switch_case() {
        String var = "Saurabh";

        switch (var) {
            case "Shubham" -> {
                System.out.println("You are going to become an Adult!");
            }
            case "Saurabh" -> System.out.println("You are going to join a Job!");
            case "Vishaka" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy Your life!");
        }

        System.out.println("Thanks for using my Java Code!");
    }

    public static void main(String[] args) {
        function_if_else();
        function_relational_and_logical_operators();
        function_if_elseif_else();
        function_switch_case();
    }
}

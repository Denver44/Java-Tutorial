package java_cwh.methods;

import java.util.Scanner;

public class GreetUserAndOverloadMethods {

    public static void main(String[] args) {
        String name = getUserName();
        greetUser(name);
    }

    public static String getUserName() {
        System.out.println("Please Enter your name");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public static void greetUser(String userName) {
        System.out.println("Hello " + userName);
    }
}

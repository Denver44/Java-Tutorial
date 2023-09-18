package java_cwh.methods;

import java.util.Scanner;

public class VariableScope {

    static double requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        boolean isQualified = isQualified(salary, creditScore);
        notifyUser(isQualified);
    }

    public static double getSalary() {
        System.out.println("Please Enter your salary: ");
        return scanner.nextDouble();
    }

    public static int getCreditScore() {
        System.out.println("Please Enter your credit Score :");
        return scanner.nextInt();
    }

    public static boolean isQualified(double salary, int creditScore) {
        return salary >= requiredSalary && creditScore >= requiredCreditScore;
    }

    public static void notifyUser(boolean isQualified) {
        if (isQualified) {
            System.out.println("Congrats, you've been approved ");
        } else {
            System.out.println("Sorry, you've been rejected ");
        }
    }
}

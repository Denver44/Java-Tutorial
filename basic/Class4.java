package java_cwh.basic;

// This is necessary for the Scanner class.

import java.util.Scanner;

public class Class4 {

    public static void main(String[] args) {

        int a = 6;
        float b = 5.6454f;
//        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        System.out.format("The value of a is %d and value of b is %.2f\n", a, b);

        Scanner sc = new Scanner(System.in);
//        String st = sc.next();
//        String st = sc.nextLine();
//        System.out.println(st);


        int x, y, z;
        System.out.println("Enter 2 numbers: ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = x + y;
        System.out.println("Sum is " + z); // Here We don't use comma we have to use + sign to add the strings.

        /*
        int  x=sc.nextInt();
        float x=sc.nextFloat();
        String x=sc.nextLine();
        */

        /*
        sc.useRadix(2); // we have to give a binary number as we declare the base is 2 It will convert it to decimal Number.
        int x=sc.nextInt();
        System.out.println(x);
        */

        System.out.println("Taking Input From the User");
//        System.out.println("Enter number 1");
//        int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("Enter number 2");
//        int b = sc.nextInt();
//        float b = sc.nextFloat();

//        int sum = a +b;
//        float sum = a +b;
//        System.out.println("The sum of these numbers is");
//        System.out.println(sum);
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
//        String str = sc.next();
        String str = sc.nextLine();
        System.out.println(str);

    }

}


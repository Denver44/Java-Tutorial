package ReadKeyboard;

import java.util.*; // This is necessary for the Scanner class.

public class ReadKeyboard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x,y,z;
        System.out.println("Enter 2 numbers: ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = x + y;
        System.out.println("Sum is "+z); // Here We don't use comma we have to use + sign to add the strings.

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
    }

}
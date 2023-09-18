package java_cwh.basic;

public class cwh_6_operators_in_java {

    public static void main(String[] args) {

        // 1. Arithmetic Operators
        int a = 4;
        System.out.println(a);

        int b = 6 % a; // Modulo Operator
        System.out.println(b);

        float c =  4.8f % 1.1f;  // Returns Decimal Remainder
        System.out.println(c);

        // 2. Assignment Operators
        int d = 9;
        d *= 3;
        System.out.println(d);

        // 3. Comparison Operators
         System.out.println(64<6);

        // 4. Logical Operators
        System.out.println(64>5 && 64>98);
        System.out.println(64>5 || 64>98);

        // 5. Bitwise Operators
        System.out.println(2&3);

        //6.  Increment and Decrement Operators
        int i = 56;
        System.out.println(i++); // post increment
        System.out.println(++i); // pre increment
    }
}

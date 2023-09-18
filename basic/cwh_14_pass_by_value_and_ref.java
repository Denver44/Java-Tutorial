package java_cwh.basic;

public class cwh_14_pass_by_value_and_ref {
    static void passByValueForPrimitiveDataTypes(int a) {
        a = 98;
    }

    static void passByValueForObjectDataTypes(int[] arr) {
        arr[0] = 98;
    }


    public static void main(String[] args) {

        // Case 1: Changing the Integer
        int x = 45;
        passByValueForPrimitiveDataTypes(x);
        System.out.println("The value of x after running change is: " + x);

        // Case 1: Changing the Array
        int[] marks = {52, 73, 77, 89, 98, 94};
        passByValueForObjectDataTypes(marks);
        System.out.println("The value of x after running change is: " + marks[0]);

    }
}

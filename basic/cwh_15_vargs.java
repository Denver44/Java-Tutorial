package java_cwh.basic;

class calculate {

    public static int add(int... values) {
        int result = 0;
        for (int value : values) {
            result += value;
        }
        return result;
    }
}

public class cwh_15_vargs {
    public static void main(String[] args) {
        System.out.println(calculate.add());
        System.out.println(calculate.add(20));
        System.out.println(calculate.add(20, 3));
        System.out.println(calculate.add(2, 30, 5));
    }
}

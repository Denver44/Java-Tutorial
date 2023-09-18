package java_cwh.basic;

public class cwh_13_loops {
    public static void functions_while_loop() {
        System.out.println("Using while Loop: ");
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("While Loop finished!");
    }

    public static void functions_do_while_loop() {
        int b = 10;
        do {
            System.out.println(b);
            b++;
        } while (b < 5);
    }

    public static void functions_for_loop() {
        for (int i = 1; i <= 10; i++)
            System.out.println(i);

        for (int i = 5; i != 0; i--)
            System.out.println(i);
    }

    public static void functions_for_break_and_continue() {
        // Break and continue using loops!
        for (int i = 0; i < 50; i++) {

            if (i == 25) {
                continue;
            }

            if (i == 45) {
                System.out.println("Breaking the loop");
                break;
            }

            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        functions_while_loop();
        functions_do_while_loop();
        functions_for_loop();
        functions_for_break_and_continue();
    }
}

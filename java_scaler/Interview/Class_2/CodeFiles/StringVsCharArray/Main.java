package StringVsCharArray;

public class Main {

    public static void main(String[] args){

        String password = "anw$755Bhd";
        password="VIJAy@1234";

        char[] pass={'x','y','z','1', '2', '3'};
        int[] arr={'1','2','3'};
        pass[4]='k';

        //System.out.println(password);
        

        // https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html#println(char%5B%5D)
        
        // System.out.println(pass);
        // System.out.println(pass.toString());
        // System.out.println(arr);

        // Question 2

        // https://stackoverflow.com/questions/62998078/why-does-printing-a-char-array-not-print-any-output
        char chararr[] = new char[5];
        System.out.println(chararr);
        System.out.println(chararr[0]);
    }
    
}

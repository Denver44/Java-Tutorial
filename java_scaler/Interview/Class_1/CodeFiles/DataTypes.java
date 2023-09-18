public class DataTypes {

    public static void main(String[] args){

        byte b = 127;

        //b = (byte)(b + 1); // we have to typecast the entire 
        // expression

        b++;

        System.out.println(b);

        b++;

        System.out.println(b);

        byte by = 10;
        short sh=10;
        int in = 10;
        long ln = 10;

        // putting larger content into smaller box
        // demote
        by=(byte)sh;
        by=(byte)in;
        by=(byte)ln;


        int i = 257;
        byte byt= (byte)i;

        System.out.println(byt);

        int val=10000; // smaller container
        long lg = val; // larger container
        // auto casting, auto conversion


        



    }
    
}

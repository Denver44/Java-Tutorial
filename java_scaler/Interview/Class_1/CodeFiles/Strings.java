public class Strings{
    public static void main(String[] args){
        String s1="Java"; // using literal

        String s2="Java";

        if(s1==s2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        
        String s3=new String("java");
        // using the keyword new

        if(s1==s3){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        s2="JavaScript";

        if(s1==s2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
        String s4="JavaScript";
        if(s4==s2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        s1=s1+"Script";

        if(s1==s4){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
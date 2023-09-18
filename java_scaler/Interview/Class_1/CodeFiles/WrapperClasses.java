public class WrapperClasses {

    public static void main(String[] args){
        Integer i = 10;
        Character c='a';
        
        Integer val =20;
        modify(val);
        System.out.println(val);
    }

    public static void modify(Integer val){
        val = val+100;
        System.out.println(val);
    }
    
}

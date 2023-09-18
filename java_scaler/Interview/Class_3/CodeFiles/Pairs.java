class Pair<T>{
    T a;
    T b;

    Pair(T a, T b){
        this.a=a;
        this.b=b;
    }

    T geta(){
        return this.a;
    }

    T getb(){
        return this.b;
    }
}

public class Pairs{
    public static void main(String args[]){

        Pair<Integer> p = new Pair<>(10, 20);

        Pair<String> p1 = new Pair<>("a", "b");

        Pair p2 = new Pair("abc", 10);
        System.out.println(p2.geta());
        System.out.println(p2.getb());


        




    }
}

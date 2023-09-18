class Pair_Int{
    int a;
    int b;

    public Pair_Int(int a, int b){
        this.a=a;
        this.b=b;
    }

    void seta(int a){
        this.a=a;
    }

    int geta(){
        return a;
    }

    void setb(int b){
        this.b=b;
    }

    int getb(){
        return this.b;
    }


}

class Pair_Gen<T, Y>{
    T a;
    Y b;

    public Pair_Gen(T a, Y b){
        this.a=a;
        this.b=b;
    }

    void seta(T a){
        this.a=a;
    }

    T geta(){
        return a;
    }

    void setb(Y b){
        this.b=b;
    }

    Y getb(){
        return this.b;
    }


}


public class Generics_Demo {

    public static void main(String[] args){
        Pair_Int p = new Pair_Int(1, 2);

        //Pair_Gen<String> p1 = new Pair_Gen<>("String", "abc");

        Pair_Gen<String, Integer> p2 = new Pair_Gen<>("name", 25);

        Pair_Gen<Object, Object> p3 = new Pair_Gen<>("100", "nvjdfnvkjd");

    }
    
}

public class Arrays {

    public static void main(String[] args){

        int[] arr = new int[5];

        arr[0]=5;
        arr[1]=6;
        arr[2]=7;
        arr[3]=9;
        arr[4]=2;

        //print(arr);

        //System.out.println(arr[0]);
        

        int a =10, b=20;
        modify(a,b);
        System.out.println(a+" "+b);

    }

    public static void modify(int a, int b){
        a=50;
        b=100;
    }

    public static void print(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

        a[0]=10; 
    }


    
}

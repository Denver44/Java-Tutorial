package finalkeyword;

public class VehicleUse {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle("Blue");
        v.colour="Red";
		
		Car c = new Car();
		
        
        //c.print();
		
		//Car c = new Vehicle("Red");
		
		// overriding
		Vehicle v1 = new Car();
		
		v1.print();
		
		Vehicle v2;
		
		int n=0;
		if(n==0) {
			v2=new Vehicle("grey");
		}else {
			v2=new Car();
		}
    
		
		
	}

    // overloading
    public static int add(int a, int b){
        return a+b;
    }

    public static long add(long a, long b){
        return a+b;
    }

    // overriding
}
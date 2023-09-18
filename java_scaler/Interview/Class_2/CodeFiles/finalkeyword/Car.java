package finalkeyword;

public class Car extends Vehicle{
	
	int numGears;
	boolean isConvertible;
	
	public Car() {
        super("Red");
        super.setmaxspeed(220);
        
		this.numGears=0;
		
	}
	
	public void print() {
		System.out.println("Car's print");
		
		System.out.println(this.colour);
		System.out.println(this.getmaxspeed());
		System.out.println(this.numGears);
		System.out.println(this.isConvertible);
	}

}
package finalkeyword;

public class Vehicle {
	
	String colour;
	private int maxspeed;
	protected int numtyres;

    public Vehicle(){

    }
	
	public Vehicle(String colour) {
		this.colour=colour;
	}
	
	public void setmaxspeed(int s) {
		this.maxspeed=s;
	}
	
	public int getmaxspeed() {
		return this.maxspeed;
	}
	
	public void print() {
		System.out.println("Vehicle's print");
		System.out.println(colour+" "+ maxspeed);
	}

}
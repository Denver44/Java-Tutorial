package OOPS;

interface Bicycle{
    int a = 10;
    int maxSpeed = 45;
    void applyBrake();
    void speedUp();
}

interface HornBicycle{
    int b = 20;
    int maxSpeed = 51;
    void blowHornWithDesiMusic();
    void blowHornWithEnglishMusic();
}

class AvonCycle implements Bicycle, HornBicycle{
    public int maxSpeed = 10;
    void normalBlowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(){
        System.out.println("Applying Brake");
    }
    public void speedUp(){
        System.out.println("Applying SpeedUP");
    }
    public void blowHornWithDesiMusic(){
        System.out.println("Desi Song Elevated pee pee pee pee");
    }
    public void blowHornWithEnglishMusic(){
        System.out.println("English Song Rocky  po po po po");
    }
}

public class cwh_55_interfaces {
    public static void main(String[] args) {

        AvonCycle cycleHarry = new AvonCycle();

        cycleHarry.applyBrake();
        cycleHarry.speedUp();
        cycleHarry.blowHornWithDesiMusic();
        cycleHarry.blowHornWithEnglishMusic();

        // You can create properties in Interfaces
        System.out.println("A : " + cycleHarry.a);
        System.out.println("B : " + cycleHarry.b);
        System.out.println("MaxSpeed : " + cycleHarry.maxSpeed);


        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454;
        //System.out.println(cycleHarry.a);

    }
}

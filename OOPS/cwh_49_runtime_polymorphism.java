package OOPS;

class Phone{
    public void on(){
        System.out.println("Turning on Phone...");
    }
    public void welcomeScreen(){
        System.out.println("Hey I am a normal phone");
    }
}

class SmartPhone extends Phone{
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
    public void welcomeScreen(){
        System.out.println("Hey I am a new Branded SmartPhone");
    }
    public void music(){
        System.out.println("Playing music over smartPhone...");
    }
}

public class cwh_49_runtime_polymorphism {
    public static void main(String[] args) {
        // Phone obj = new Phone(); // Allowed

        Phone obj = new SmartPhone(); // Yes it is allowed
        // SmartPhone obj2 = new Phone(); // Not allowed

        obj.on();
        obj.welcomeScreen();
//        obj.music(); // As this function is not over ride in the derived class so we will get error.

        SmartPhone smObj = new SmartPhone(); // Allowed
        smObj.music();
    }
}

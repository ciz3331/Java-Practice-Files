// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).

class Car{
    //will be passed as parameters
    private int cylinders;
    private String name;

    private int wheels = 4;
    private boolean engine = true;

    Car(int cylinders, String name){

        this.cylinders = cylinders;
        this.name = name;
    }

    public void startEngine(){
        System.out.println("Starting generic Car");
    }
    public void accelerate(){
        System.out.println("Accelerating generic Car");
    }
    public void brake(){
        System.out.println("Braking generic Car");
    }
    //getters
    public int getCylinders(){return this.cylinders;}
    public String getName(){return this.name;}
    public int getWheels(){return this.wheels;}
    public boolean getEngine(){return this.engine;}

}
class DodgeChallenger extends Car{
    DodgeChallenger(int cylinders, String name){
        super(cylinders,name);
    }
    @Override
    public void startEngine(){
        System.out.println(getClass() +" Starting Dodge Challenger");
    }
    public void accelerate(){
        System.out.println("Accelerating Dodge Challenger");
    }
    public void brake(){
        System.out.println("Braking Dodge Challenger");
    }
}
class FordMustang extends Car{
    FordMustang(int cylinders, String name){
        super(cylinders, name);
    }
    @Override
    public void startEngine(){
        System.out.println("Starting Ford Mustang");
    }
    public void accelerate(){
        System.out.println("Accelerating Ford Mustang");
    }
    public void brake(){
        System.out.println("Braking Dodge Challenger");
    }
}
class Ferrari348 extends Car{
    Ferrari348(int cylinders, String name){
        super(cylinders, name);
    }
    @Override
    public void startEngine(){
        System.out.println("Starting Ferrari 348");
    }
    public void accelerate(){
        System.out.println("Accelerating Ferrari 348");
    }
    public void brake(){
        System.out.println("Braking Ferrari 348");
    }
}


public class Main {
    public static void main(String[] args) {
        Car test = new Ferrari348(8, "test Car");
        test.startEngine();
        System.out.println(test.getName());

        Car test2 = new FordMustang(6, "testest");
        test2.accelerate();
        System.out.println(test.getWheels());

        Car test3 = new DodgeChallenger(4, "testicles");
        test3.startEngine();
        System.out.println(test.getEngine());
    }
}
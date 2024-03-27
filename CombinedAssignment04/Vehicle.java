package CombinedAssignment04;


abstract public class Vehicle {
    String numberPlate;
    int numberOfWheel;
    int numberOfPasengers;
    int speed;
    void move(){
        System.out.println("The vehicle is moving");
    }
    void stop(){
        System.out.println("the vehicle has been stopped");
    }
}

class Car extends Vehicle{
    Car(String numberPlate){
        this.numberPlate = numberPlate;
    }
    void move(){
        System.out.println("The car is moving");
    }
    void stop(){
        System.out.println("the car has been stopped");
    }
}
class FourSeater extends Car{
    FourSeater(String numberPlate){
        super(numberPlate);
        this.numberOfWheel = 4;
    }
}

class Sedan extends FourSeater{
    boolean hasSpoiler;
    Sedan(String numberPlate, boolean hasSpoiler){
        super(numberPlate);
        this.hasSpoiler = hasSpoiler;
    }
}
abstract class Flyer extends Vehicle{
    void fly(){
        System.out.println("The flyer is flying");
    }
    void land(){
        System.out.println("the flyer is landing");
    }
}
class Aeroplane extends Flyer{
    boolean isCargo = false;
    void fly(){
        System.out.println("The aeroplane is flying");
    }
    void land(){
        System.out.println("the aeroplane is landing");
    }
}

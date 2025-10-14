package academy.devdojo.javaoneforall.javacore.Fstaticmodifier.domain;

public class Car {
    private String name;
    private double maxSpeed;
    public static double speedLimit= 250;

    public void print(){
        System.out.println("------------------------");
        System.out.println("Name " + this.name);
        System.out.println("MaxSpeed " + this.maxSpeed);
        System.out.println("SpeedLimit " + Car.speedLimit);
    }

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}

public class Car extends Vehicle {

    public Car(double speed) {
        super(speed);
    }

    public void carSpeed() {
        System.out.println("Car speed is: " + speed + " km/h");
    }
}

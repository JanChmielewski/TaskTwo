public class Boat extends Vehicle {

    public Boat(double speed) {
        super(speed);
    }

    public void boatSpeed() {
        System.out.println("Boat speed is: " + speed/1.852 + " knots");

    }
}

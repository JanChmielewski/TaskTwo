import java.util.Scanner;

public class Vehicle {

    public static final Scanner in = new Scanner(System.in);

    protected double speed;

    public Vehicle (double speed) { this.speed = speed; }

    public double getSpeed() {
        speed = in.nextDouble();
        return speed;
    }





}

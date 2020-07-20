import java.util.Scanner;

public class Vehicle {

    public static final Scanner in = new Scanner(System.in);

    public double speedRead() {

        System.out.print("Enter your speed here: ");
        double speed = 0;
        speed = in.nextInt();
        return speed;
    }

}

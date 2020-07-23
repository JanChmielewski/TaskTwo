import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter speed here: ");
        Vehicle veh = new Vehicle(0);
        Car car = new Car(veh.getSpeed());
        Boat boat = new Boat(veh.getSpeed());
        Bike bike = new Bike(veh.getSpeed());

        car.carSpeed();
        boat.boatSpeed();
        bike.bikeSpeed();


    }
}

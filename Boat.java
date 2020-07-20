public class Boat {

    Vehicle veh = new Vehicle();

    public double boatSpeed() {
        double boatSpeed = (veh.speedRead()/1.852);
        return boatSpeed;
    }
}

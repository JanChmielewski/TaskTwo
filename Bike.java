public class Bike {
    Vehicle veh = new Vehicle();

    public double bikeSpeed() {
        double bikeSpeed = (veh.speedRead()/3.6);
        return bikeSpeed;
    }
}

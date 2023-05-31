public class Car extends Vehicle {
    public boolean hasHeatedSeats;

    public Car(String vehicleType, String startColor, int startPower, int startCylinders, int startWheels, int startSpeed, boolean heatedSeats) {
        super(startColor, startPower, startCylinders, startWheels, startSpeed, vehicleType);
        heatedSeats = hasHeatedSeats;
    }

}

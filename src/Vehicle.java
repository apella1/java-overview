interface VehicleInterface {
    void increaseSpeed(int increase);

    void applyBrakes(int decrement);

    void changeColor(String newColor);

    void increaseHorsePower(int newHorsePower);

    void printStates();
}

public class Vehicle implements VehicleInterface {
    String type;
    int horsePower;
    int noOfCylinders;
    int wheels;
    int speed;
    String color;

    public Vehicle(String vehicleType, int startPower, int startCylinders, int startWheels, int startSpeed, String startColor) {
        type = vehicleType;
        horsePower = startPower;
        noOfCylinders = startCylinders;
        wheels = startWheels;
        speed = startSpeed;
        color = startColor;
    }

    public void increaseSpeed(int increase) {
        speed = speed + increase;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void changeColor(String newColor) {
        color = newColor;
    }

    public void increaseHorsePower(int newHorsePower) {
        horsePower = newHorsePower;
    }

    public void printStates() {
        System.out.println("Type: " + type + " Speed: " + speed + " Color: " + color + " Cylinders: " + noOfCylinders + " Wheels: " + wheels + " Horse Power: " + horsePower);
    }


}

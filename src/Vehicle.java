interface VehicleInterface {
    void increaseSpeed(int increase);

    void applyBrakes(int decrement);

    void changeColor(String newColor);

    void increaseHorsePower(int newHorsePower);

    void printStates();
}

public class Vehicle implements VehicleInterface {
    String type = "";
    int horsePower = 0;
    int noOfCylinders = 0;
    int wheels = 0;
    int speed = 0;
    String color = "";

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

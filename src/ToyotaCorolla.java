public class ToyotaCorolla extends Car {
    public ToyotaCorolla(String vehicleType, String startColor, int startPower, int startCylinders, int startWheels, int startSpeed, boolean heatedSeats) {
        super(vehicleType, startColor, startPower, startCylinders, startWheels, startSpeed, heatedSeats);
    }

    public static void main(String[] args) {
        ToyotaCorolla model2018;
        model2018 = new ToyotaCorolla("Toyota Corolla", "Blue", 0, 0, 0, 0, true);

        model2018.type = "Toyota Corolla";
        model2018.color = "Blue";
        model2018.hasHeatedSeats = true;
        model2018.horsePower = 345;
        model2018.speed = 200;
        model2018.wheels = 4;
        model2018.noOfCylinders = 6;
        model2018.increaseSpeed(10);
        model2018.changeColor("Red");
        model2018.increaseHorsePower(788);
        model2018.printStates();
    }
}

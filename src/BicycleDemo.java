public class BicycleDemo {
    public static void main(String[] args) {
        // creating bicycle objects
        Bicycle roadBike;
        roadBike = new Bicycle();
        Bicycle mountainBike;
        mountainBike = new Bicycle();

        // invoking methods on the objects
        roadBike.changeCadence(50);
        roadBike.speedUp(40);
        roadBike.changeGear(3);
        roadBike.applyBrakes(10);
        roadBike.printStates();

        mountainBike.changeCadence(50);
        mountainBike.speedUp(40);
        mountainBike.changeGear(3);
        mountainBike.speedUp(40);
        mountainBike.changeGear(3);
        mountainBike.printStates();
    }
}

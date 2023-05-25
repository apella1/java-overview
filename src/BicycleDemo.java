public class BicycleDemo {
    public static void main(String[] args) {
        // creating bicycle objects
        Bicycle roadBike;
        roadBike = new Bicycle(0, 0, 0);
        MountainBike mountainBike;
        mountainBike = new MountainBike(0, 0, 0, 0);

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
        mountainBike.setSeatHeight(70);
        final int speed = mountainBike.getSpeed();
        mountainBike.printStates();
        System.out.println(speed);
    }
}

interface Bike {
    void changeCadence(int newValue);

    void speedUp(int newValue);

    void applyBrakes(int decrement);

    void changeGear(int newValue);
}

class Bicycle implements Bike {
    int cadence = 0;
    int speed = 0;
    int gear = 0;

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("Cadence: " + cadence + " Speed: " + speed + " Gear " + gear);
    }
}
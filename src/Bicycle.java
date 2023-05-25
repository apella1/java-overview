interface Bike {
    void changeCadence(int newValue);

    void speedUp(int newValue);

    void applyBrakes(int decrement);

    void changeGear(int newValue);
}

class Bicycle implements Bike {
    // member variables in a class - fields e.g. cadence
    // variables in a method or block of code - local variables
    // in method declarations - parameters
    public int cadence;
    public int speed;
    public int gear;

    // constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // methods can be overloaded
    // you cannot define methods with the same signature as the compiler
    // doesn't consider return types
    // method overloading should be used sparingly for that matter

    public int getSpeed() {
        return speed;
    }

    public int getCadence() {
        return cadence;
    }

    public int getGear() {
        return gear;
    }

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public void printStates() {
        System.out.println("Cadence: " + cadence + " Speed: " + speed + " Gear " + gear);
    }
}
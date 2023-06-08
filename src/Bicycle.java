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

    // instance variable
    private int id;

    // class variable for the number of objects instantiated
    // class variables are referenced by the class name itself i.e. Bicycle.numberOfBicycles
    private static int numberOfBicycles;

    // constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        // increment the number of bicycles an assign the id number
        id = ++numberOfBicycles;
    }

    // methods can be overloaded
    // you cannot define methods with the same signature as the compiler
    // doesn't consider return types
    // method overloading should be used sparingly for that matter

    public int getId() {
        return id;
    }

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

    // using a static method to access static a static field(common usage)
    // class methods cannot use the `this` keyword as there is no instance for `this` to refer to
    public static int getNumberOfBicycles() {
        return numberOfBicycles;
    }

    public void printStates() {
        System.out.println("Cadence: " + cadence + " Speed: " + speed + " Gear " + gear);
    }
}
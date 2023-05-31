public class InstanceofOperator {
    // the instanceof operator compares an object to a specified type
    public static void main(String[] args) {
        Car tesla = new Car("Tesla", "Cyan", 0, 0, 0, 0, true);
        System.out.println(tesla instanceof Car);
        System.out.println(tesla instanceof Vehicle);
    }
}
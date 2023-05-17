public class ArrayDemo {
    public static void main(String[] args) {
        // declaring the array
        int[] primeNumbers;

        // allocation memory for 10 integer elements
        primeNumbers = new int[10];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;
        primeNumbers[6] = 17;
        primeNumbers[7] = 19;
        primeNumbers[8] = 23;
        primeNumbers[9] = 29;

        System.out.println("Element at index 0: " + primeNumbers[0]);
    }
}

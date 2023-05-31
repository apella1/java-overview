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

        String[] favouriteLanguages;
        favouriteLanguages = new String[3];
        favouriteLanguages[0] = "Java";
        favouriteLanguages[1] = "TypeScript";
        favouriteLanguages[2] = "Rust";

        System.out.println(java.util.Arrays.toString(favouriteLanguages));

        // short-cut syntax for creating and initializing an array.
        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        char[] possibleGrades = {'A', 'B', 'C', 'D', 'E'};
        String[] movies;
        movies = new String[4];
        movies[0] = "Family Guy";
        movies[1] = "American Dad";
        movies[2] = "Rick and Morty";
        movies[3] = "Pretty Smart";

        System.out.println("Element at index 0: " + primeNumbers[0]);
        System.out.println(java.util.Arrays.toString(numArray));
        System.out.println(java.util.Arrays.toString(possibleGrades));
        System.out.println(java.util.Arrays.toString(movies));
    }
}

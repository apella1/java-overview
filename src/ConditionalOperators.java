public class ConditionalOperators {
    // the logical conditional operators have a short-circuiting effect
    // meaning the second argument is computed only if necessary
    public static void main(String[] args) {
        int firstValue = 3;
        int secondValue = 4;

        if ((firstValue == 3) && (secondValue == 4)) {
            System.out.println("First value is 3 AND second value is 4");
        }
        if ((firstValue == 3) || (secondValue ==4)) {
            System.out.println("Fist value is 3 OR second value is 4");
        }

        int mathsScore = 88;
        int secondMathsScore = 77;
        boolean hasPassed = true;
        int result;
        // ternary operator
        result = hasPassed ? mathsScore : secondMathsScore;
        System.out.println(result);
    }
}
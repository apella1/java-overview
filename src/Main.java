public class Main {
    static final int ACCEPTED_RESUMES = 10;

    public static void main(String[] args) {
        // data types
        int runningSpeed = 100;
        int daysOfTheYear = 365;
        byte dayOfTheWeek = 7;
        short marksScored = 87;
        long depthOfLakeVictoria = 53232522;
        double currentWeight = 67.4;
        boolean hasWonAnyMatch = false;
        char grade = 'A';
        String dayOverview = "Today is the big match day";
        System.out.println(daysOfTheYear);
        System.out.println("My running speed is " + runningSpeed);
        System.out.println("The number of accepted resumes is " + ACCEPTED_RESUMES);


        // the static keyword in combination with final is used to create a constant
        // ? why is there an error making PI static
        final double PI =  3.1426256;
        final double LOAN_AMOUNT_ALLOWED = 600000.00;
    }

}
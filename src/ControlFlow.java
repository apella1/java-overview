enum PaymentStatus {
    UNPAID, PAID, UNKNOWN, PARTPAID, DISPUTED;
}
public class ControlFlow {
    // if-then, if-then-else
    // the switch statement
    public static void main(String[] args) {
        int month = 6;
        String monthString = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            default -> "Invalid month";
        };
        System.out.println(monthString);
        PaymentStatus paymentStatus = PaymentStatus.UNPAID;
        PaymentStatus disputed = PaymentStatus.DISPUTED;
        String message = switch (paymentStatus) {
            case UNPAID -> "Tho order has not been paid yet.";
            case PAID -> "The order has been paid. Proceed to checkout.";
            case UNKNOWN -> "Please check with your provider";
            case PARTPAID -> "Finish the remaining portion of your payment before picking your product";
            case DISPUTED -> "Check with the office to settle the dispute";
        };
        System.out.println(message);
        System.out.println(disputed);

        // multiple cases
        int currentMonth = 88;
        int year = 2000;
        int numOfDays = 0;

        switch (currentMonth) {
            case 1, 3, 5, 7, 8, 10, 12 -> numOfDays = 31;
            case 4, 6, 11, 9 -> numOfDays = 30;
            case 2 -> {
                if (year % 4 == 0)
                    numOfDays = 29;
                else
                    numOfDays = 28;
            }
            default -> System.out.println("Invalid month");
        }
        System.out.println("Number of days in the current month is " + numOfDays);
    }
}

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
        String message = switch (paymentStatus) {
            case UNPAID -> "Tho order has not been paid yet.";
            case PAID -> "The order has been paid. Proceed to checkout.";
            case UNKNOWN -> "Please check with your provider";
            case PARTPAID -> "Finish the remaining portion of your payment before picking your product";
            case DISPUTED -> "Check with the office to settle the dispute";
        };
        System.out.println(message);
    }
}

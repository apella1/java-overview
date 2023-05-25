public class ContinueWithLabelDemo {
    public static void main(String[] args) {
        String phrase = "Look for a substring in me.";
        String sub = "rng";
        boolean foundSub = false;

        int max = phrase.length() - sub.length();
        test:
        for (int i = 0; i <= max; i++) {
            int n = sub.length();
            int j = i;
            int k = 0;

            while (n-- != 0) {
                if (phrase.charAt(j++) != sub.charAt(k++)) {
                    continue test;
                }
            }
            foundSub = true;
            break;
        }
        System.out.println(foundSub ? "Found it." : "Didn't find it.");

        int aNumber = 3;
        if (aNumber >= 0) {
            if (aNumber == 0) {
                System.out.println("first number");
            } else System.out.println("second number");
        }
        System.out.println("third number");
    }
}

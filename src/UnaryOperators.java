public class UnaryOperators {
    // checking the difference in the operation of i++ and ++i
    public static void main(String[] args) {
        int score = 8;
        score--;
        System.out.println(score);
        score++;
        System.out.println(score);
        boolean hasFailed = true;
        System.out.println(!hasFailed);
        score = -score;
        System.out.println(score);
    }
}
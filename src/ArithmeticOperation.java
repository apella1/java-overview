public class ArithmeticOperation {
    public static void main(String[] args) {
        System.out.println(1 + 2);
        System.out.println(4 - 2);
        System.out.println(9 * 3);
        System.out.println(20 % 10);

        int i = 10;
        int k = 10;
        int n = i++ % 5;
        int j = ++k % 5;
        System.out.println(n);
        System.out.println(j);
    }
}
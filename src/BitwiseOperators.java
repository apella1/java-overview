public class BitwiseOperators {
    // not commonly used
    // <<, >>, >>>, &, ^, |, ~

    public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        System.out.println(val & bitmask);
    }
}

public class MultidimensionalArray {
    // these are arrays whose elements are arrays themselves
    public static void main(String[] args) {
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Peter", "Bunny", "Jay"}
        };

        System.out.println(names[0][2] + names[1][1]);
        System.out.println(names.length);
    }

}

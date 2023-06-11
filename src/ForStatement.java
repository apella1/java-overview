public class ForStatement {
    // for loop
    public static void main(String[] args) {
        for (int i = 0; i < 34; i++)
            System.out.println("Count is " + i);

        int[] numbers = {2, 3, 5, 7, 11, 13};
        // this form is recommended over the first way whenever possible
        for (int num : numbers)
            System.out.println("Prime number is " + num);

        // unlabelled break statement
        int myNumber = 7;
        boolean foundMyNo = false;

        for (int number : numbers) {
            if (number == myNumber) {
                foundMyNo = true;
                break;
            }
        }

        if (foundMyNo) {
            System.out.println("Found " + myNumber);
        } else
            System.out.println(myNumber + " is not in the array.");

        // multidimensional array
        int[][] numArray = {
                {1, 3, 4, 5, 6, 7,},
                {8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18, 19, 20}
        };

        int searchNo = 40;
        int a;
        int b = 0; // why are initializing b only
        boolean numFound = false;

        // labeled loop
        search:
        for (a = 0; a < numArray.length; a++) {
            for (b = 0; b < numArray[a].length; b++) {
                if (numArray[a][b] == searchNo) {
                    numFound = true;
                    break search;
                }
            }
        }
        if (numFound) {
            System.out.println("Found " + searchNo + " at " + a + ", " + b);
        } else {
            System.out.println(searchNo + " is not in the array.");
        }

        // continue statement
        String introduction = "peter piper picked a peck of pickled peppers";
        int max = introduction.length();
        int numOfPs = 0;

        for (int i = 0; i < max; i++) {
            if (introduction.charAt(i) != 'p') continue;
            numOfPs++;
        }
        System.out.println(numOfPs + "Ps found in the string.");

    }
}

package practice;

public class StackDemo {
    public static void main(String[] args) {
        Stack myNumbers = new Stack();
        myNumbers.push(10);
        myNumbers.push(1);
        myNumbers.push(11);
        myNumbers.push(20);
        myNumbers.push(17);
        System.out.println(myNumbers.isStackEmpty());
        System.out.println(myNumbers.peek());
        System.out.println(myNumbers.pop());
        for (Integer myNumber : myNumbers) {
            System.out.println(myNumber);
        }
    }

}

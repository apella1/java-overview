package practice;

import java.util.ArrayList;

public class Stack extends ArrayList<Integer> {

    private final ArrayList<Integer> elements;

    public Stack() {
        elements = new ArrayList<>();
    }

    void push(int value) {
        elements.add(value);
    }

    // removes the last element of the ArrayList
    public int pop() {
        if (isStackEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        int lastIndex = elements.size() - 1;
        return elements.remove(lastIndex);
    }

    // return the last element of the ArrayList if not empty
    int peek() {
        if (isStackEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        int lastIndex = elements.size() - 1;
        return elements.get(lastIndex);
    }

    boolean isStackEmpty() {
        return elements.isEmpty();
    }
}

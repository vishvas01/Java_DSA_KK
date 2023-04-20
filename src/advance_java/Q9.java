package advance_java;
 interface Stack<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
}

 class ArrayStack<T> implements Stack<T> {
    private T[] items;
    private int top;

    public ArrayStack(int capacity) {
        items = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T item) {
        if (top == items.length - 1) {
            throw new IllegalStateException("Stack is full");
        }

        top++;
        items[top] = item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        T item = items[top];
        items[top] = null;
        top--;

        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return items[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}

public class Q9 {
    public static void main(String[] args) {
    Stack<Integer> stack = new ArrayStack<>(10);
    stack.push(10);
    stack.push(2);
    stack.push(5);
    stack.push(6);
    stack.push(50);
    stack.push(12);
    stack.push(9);
    System.out.println(stack.peek()); 
    System.out.println(stack.pop()); 
    System.out.println(stack.peek());
    System.out.println(stack.size()); 
    System.out.println(stack.isEmpty());

    }
}

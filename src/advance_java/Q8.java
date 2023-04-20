package advance_java;

 interface Queue<T> {
    void enqueue(T item);
    T dequeue();
    T peek();
    boolean isEmpty();
    int size();
}

 class ArrayQueue<T> implements Queue<T> {
    private T[] items;
    private int front;
    private int rear;
    private int count;

    public ArrayQueue(int capacity) {
        items = (T[]) new Object[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(T item) {
        if (count == items.length) {
            throw new IllegalStateException("Queue is full");
        }

        rear = (rear + 1) % items.length;
        items[rear] = item;
        count++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        T item = items[front];
        items[front] = null;
        front = (front + 1) % items.length;
        count--;

        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return items[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }
}

public class Q8{
    public static void main(String[] args) {
    Queue<Integer> queue = new ArrayQueue<>(5);
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    System.out.println(queue.peek()); 
    System.out.println(queue.dequeue()); 
    System.out.println(queue.peek()); 
    System.out.println(queue.size()); 
    System.out.println(queue.isEmpty()); 

    }
}


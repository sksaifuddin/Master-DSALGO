public class Stack<V> {
    private int maxSize;
    private int top;
    private V arr[];

    @SuppressWarnings("unchecked")
    public Stack(int max_size) {
        this.maxSize = max_size;
        this.top = -1; // initially top is at -1;
        arr = (V[]) new Object[max_size];
    }

    public int getCapactiy() {
        return maxSize;
    }

    public boolean isFull() {
        return this.top == maxSize - 1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public V top() {
        if(isEmpty()) {
            return null;
        }
        return arr[top];
    }

    public void push(V value) {
        if(isFull()) {
            System.err.println("Stack is FUll");
            return;
        }
        arr[++top] = value;
    }

    public V pop() {
        if(isEmpty()) {
            return null;
        }
        return arr[top--];
    }

}
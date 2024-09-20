class MyStack {
    private Node top;
    private int size;

    private class Node {
        Object value;
        Node next;

        Node(Object value) {
            this.value = value;
        }
    }

    public MyStack() {
        top = null;
        size = 0;
    }

    public void push(Object value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public void clear() {
        top = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (top == null) {
            return null;
        }
        return top.value;
    }

    public Object pop() {
        if (top == null) {
            return null;
        }
        Object value = top.value;
        top = top.next;
        size--;
        return value;
    }
}

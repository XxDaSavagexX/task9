public class Main {
    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Apple");
        myArrayList.add("Banana");
        System.out.println("ArrayList Size: " + myArrayList.size());
        System.out.println("Element at index 1: " + myArrayList.get(1));
        myArrayList.remove(0);
        System.out.println("ArrayList Size after removal: " + myArrayList.size());

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("One");
        myLinkedList.add("Two");
        System.out.println("LinkedList Size: " + myLinkedList.size());
        System.out.println("Element at index 0: " + myLinkedList.get(0));
        myLinkedList.remove(0);
        System.out.println("LinkedList Size after removal: " + myLinkedList.size());

        MyQueue myQueue = new MyQueue();
        myQueue.add("First");
        myQueue.add("Second");
        System.out.println("Queue Size: " + myQueue.size());
        System.out.println("Peek: " + myQueue.peek());
        System.out.println("Poll: " + myQueue.poll());
        System.out.println("Queue Size after poll: " + myQueue.size());

        MyStack myStack = new MyStack();
        myStack.push("First");
        myStack.push("Second");
        System.out.println("Stack Size: " + myStack.size());
        System.out.println("Peek: " + myStack.peek());
        System.out.println("Pop: " + myStack.pop());
        System.out.println("Stack Size after pop: " + myStack.size());

        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put("key1", "value1");
        myHashMap.put("key2", "value2");
        System.out.println("HashMap Size: " + myHashMap.size());
        System.out.println("Get value for 'key1': " + myHashMap.get("key1"));
        myHashMap.remove("key1");
        System.out.println("HashMap Size after removal: " + myHashMap.size());
    }
}

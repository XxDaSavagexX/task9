class MyHashMap {
    private Node[] buckets;
    private int size;

    private class Node {
        Object key;
        Object value;
        Node next;

        Node(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        buckets = new Node[16];
        size = 0;
    }

    private int hash(Object key) {
        return key.hashCode() % buckets.length;
    }

    public void put(Object key, Object value) {
        int index = hash(key);
        Node current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }
        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;
    }

    public void remove(Object key) {
        int index = hash(key);
        Node current = buckets[index];
        Node previous = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    buckets[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public void clear() {
        buckets = new Node[16];
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(Object key) {
        int index = hash(key);
        Node current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }
}

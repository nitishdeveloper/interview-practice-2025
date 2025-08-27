package DSA.linkedList;

public class Node {
    private final int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node insert(int data, Node head) {
        Node node1 = new Node(data);
        if (head == null) {
            head = node1;
        }
        while (head != null) {
            head = head.next;
        }
        return head = node1;
    }

    public int getData() {
        return data;
    }
}

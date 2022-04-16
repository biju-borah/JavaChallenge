//Find the nth node from the end & remove it.
public class Q1 {

    int size = 0;
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            head.next = null;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        return;

    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " --> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    public int getSize() {
        return size;
    }

    public void removeNthNodeFromEnd(int n) {
        int size = getSize();
        Node currentNode = head;
        for (int i = 0; i < size - n - 1; i++) {
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.next.data);
        currentNode.next = currentNode.next.next;
    }

    public static void main(String[] args) {
        Q1 linkedList = new Q1();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.removeNthNodeFromEnd(2);
        linkedList.printList();
    }
}

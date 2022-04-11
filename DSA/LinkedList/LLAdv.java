import java.util.List;

public class LLAdv {
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

    ////////////////// Advanced /////////////////////
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        head = newNode;
        head.next = currentNode;
    }

    public void addIndex(int data, int index) {
        if (index > size || index < 0) {
            System.out.println("Invalid index");
            return;
        }
        size++;
        Node newNode = new Node(data);
        Node currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    public static void main(String[] args) {
        LLAdv linkedList = new LLAdv();
        linkedList.addLast(1);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addFirst(0);
        linkedList.addIndex(2, 2);
        linkedList.addIndex(6, 6);
        linkedList.printList();
    }
}

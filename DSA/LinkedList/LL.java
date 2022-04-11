public class LL {
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

    public static void main(String[] args) {
        LL linkedList = new LL();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.printList();
    }
}
import java.io.PushbackInputStream;

public class LLDel {
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

    public void delLast() {
        Node curNode = head;
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        for (int i = 0; i < size - 1; i++) {
            curNode = curNode.next;
        }
        curNode.next = null;

    }

    public void delFirst() {
        size--;
        Node curNode = head;
        head = head.next;
        curNode.next = null;
    }

    public void delIndex(int index) {
        size--;
        Node curNode = head;
        Node nextNode = curNode.next;
        for (int i = 0; i < index - 1; i++) {
            curNode = curNode.next;
            nextNode = nextNode.next;
        }
        curNode.next = nextNode.next;
        nextNode.next = null;
    }

    public static void main(String[] args) {
        LLDel linkedList = new LLDel();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.delLast();
        linkedList.delFirst();
        linkedList.delIndex(1);
        linkedList.printList();
    }
}

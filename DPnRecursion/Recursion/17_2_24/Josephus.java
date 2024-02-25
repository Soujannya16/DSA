public class Josephus {
    public static void main(String[] args) {
        int n = 5;
        // for (int i = 0; i < n; i++) {
        // Node.createOrAdd(i);
        // }
        // Node.printList();
        System.out.println(getJos(n, 3));
    }

    public static int getJos(int n, int k) {
        return 0;
    }
}

// class Node {
// public static Node head = null;
// int data;
// Node next;

// Node(int value) {
// data = value;
// next = null;
// }
//
// public static void createOrAdd(int data) {
// Node newNode = new Node(data);
// if (head == null)
// head = newNode;
// else {
// Node temp = head;
// while (temp.next != null) {
// temp = temp.next;
// }
// temp.next = newNode;
// }
// }

// public static void printList() {
// Node temp = head;
// while (temp != null) {
// System.out.println(temp.data);
// temp = temp.next;
// }
// }
// }
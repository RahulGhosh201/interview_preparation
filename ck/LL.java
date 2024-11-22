class Node {
    int data;
    Node next;

    // Constructor to create a new node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CustomLinkedList {
    private Node head;

    // Add a node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Print the elements of the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Remove a node with a specific value
    public void remove(int data) {
        if (head == null) {
            System.out.println("List is empty. Cannot remove.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Element not found in the list.");
        } else {
            current.next = current.next.next;
        }
    }

    // Check if the list contains a specific value
    public boolean contains(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

public class LL {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        // Adding elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Display the list
        System.out.println("Linked List:");
        list.display();

        // Remove an element
        list.remove(20);
        System.out.println("After removing 20:");
        list.display();

        // Check if the list contains an element
        System.out.println("List contains 30? " + list.contains(30));
        System.out.println("List contains 50? " + list.contains(50));
    }
}

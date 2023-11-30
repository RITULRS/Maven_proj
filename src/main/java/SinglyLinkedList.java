import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    //public static Node start;
    public static Node insert(Node start, int data) {
        if (start == null) {
            start = new Node(data);
            return start;
        }
        Node temp = start;

        while (temp.next != null)
            temp = temp.next;

        temp.next = new Node(data);
        return start;
    }

    public static Node insertLIFO(Node start, int data) {
        Node temp = new Node(data);
        temp.next = null;

        if (start == null) {
            start = temp;
            return start;
        }
        temp.next = start;
        start = temp;
        return start;
    }

    public static Node delete(Node start, int input) {
        Node prev = start;
        Node curr = start;
        while (curr != null && curr.data != input) {
            prev = curr;
            curr = curr.next;
        }
        if (curr == start)
            start = curr.next;

        prev.next = curr.next;

        return start;
    }

    public static void display(Node start) {
        System.out.println("display");
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of nodes u want to add");
        int no = sc.nextInt();
        Node start = null;
        while (no > 0) {
            System.out.println("Enter value to add");
            int value = sc.nextInt();
            //start = insert(start,value);
            start = insertLIFO(start, value);
            no--;
        }
        display(start);
        int dinp = -1;
        while (dinp != 0) {
            System.out.println();
            System.out.println("Enter data u want to delete,else enter 0");
            if (dinp==0)break;
            dinp = sc.nextInt();
            start = delete(start, dinp);
            display(start);
        }
    }
}

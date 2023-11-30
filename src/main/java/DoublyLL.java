import java.util.Scanner;

class Node1{
    Node1 prev;
    int data;
    Node1 next;

    Node1(int a){
        data = a;
        prev = null;
        next = null;
    }
}

public class DoublyLL {
    public static Node1 insertLIFO(Node1 start, int data) {
        Node1 a = new Node1(data);

        if (start == null) {
            start = a;
            return start;
        }
        Node1 temp = start;

        while(temp.next != null)
            temp = temp.next;


        temp.next = a;
        a.prev = temp;

        return start;
    }
    public static void display(Node1 start){
        while(start != null){
            System.out.print (start.data+" ");
            start = start.next;
        }
    }
    public static Node1 delete(Node1 start,int val){
        Node1 prev = start;
        Node1 curr =start;
        while(curr != null && curr.data != val){
            prev = curr;
            curr = curr.next;
        }
        if(curr == null)
        {
            System.out.println("entered data not found!!");
            return start;
        }
        if(curr == start) {
            curr.next.prev = start.prev;
            start = curr.next;
            return start;
        }
        prev.next = curr.next;
        if(curr.next != null)
        curr.next.prev = curr.prev;

        return start;

    }
    public static Node1 ins(Node1 start,int pos,int val)
    {
        Node1 temp = start;
        while(temp != null && temp.data != pos){
            temp = temp.next;
        }
        if(temp == null)
            return start;

        Node1 a = new Node1(val);
        a.next = temp.next;
        if(temp.next != null)
        temp.next.prev = a;

        temp.next = a;
        return start;
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of nodes u want to add");
        int no = sc.nextInt();
        Node1 start = null;
        while (no > 0) {
            System.out.println("Enter value to add");
            int value = sc.nextInt();
            //start = insert(start,value);
            start = insertLIFO(start, value);
            no--;
        }
        display(start);
        int dinp = -1;
        while(dinp != 0){
            System.out.println("Plese enter data u want to delete, or enter 0");
            dinp = sc.nextInt();
            if(dinp == 0)
                break;
            start = delete(start,dinp);
            display(start);
        }
        int ins = -1;
        while (ins != 0) {
            System.out.println("Enter the data after that u want to add a node,or enter 0");
            ins = sc.nextInt();
            if(ins == 0)
                break;

            System.out.println("Enter the data");
            int i = sc.nextInt();
            start = ins(start, ins, i);
            display(start);
        }
    }
}

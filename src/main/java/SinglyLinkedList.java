import java.util.Scanner;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
 }
public class SinglyLinkedList {
   public static Node insert(Node start,int data){
        if(start == null) {
            start = new Node(data);
            return start;
        }
        Node temp = start;

        while(temp.next != null)
            temp = temp.next;

        temp.next = new Node(data);
        return start;
    }
    public static void display(Node start){
        while(start != null){
            System.out.print(start.data+" ");
            start = start.next;
          }
    }
    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of nodes u want to add");
          int no = sc.nextInt();
          Node start = null;
          while(no > 0){
              System.out.println("Enter value to add");
              int value = sc.nextInt();
              start =  insert(start,value);
              no--;
          }
          display(start);
    }
}

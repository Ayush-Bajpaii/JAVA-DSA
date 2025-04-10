package LINKEDLIST;

public class recursivell {

    public static void displayrllr(Node head){
        if(head == null) return;
        displayrllr(head.next);
        System.out.print(head.data + " ");
    }

    public static void displayrll(Node head){
        if(head == null) return;
        System.out.print(head.data + " ");
        displayrll(head.next);
    }

    public static int length(Node head){
    int count = 0;
    while(head != null){
        count++;
        head = head.next;
    }
    return count;
    }


    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(100);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        displayrll(a);
        System.out.println();
        displayrllr(a);
        System.out.println();
        System.out.println( length(a));
    }
}

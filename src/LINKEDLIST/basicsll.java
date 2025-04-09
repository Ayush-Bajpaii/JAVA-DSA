package LINKEDLIST;

public class basicsll {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node x = new Node(5);
        Node y = new Node(6);
        Node z = new Node(7);
        Node a = new Node(8);
        x.next = y;
        y.next = z;
        z.next = a;
        System.out.println(x.next.data);
        System.out.println(y.next.data);
        System.out.println(z.next.data);


    }
}

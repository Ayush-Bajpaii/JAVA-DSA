package LINKEDLIST;

public class basicsll {

    public static void display (Node head){
     Node temp = head;
     while(head != null ){
         System.out.print(head.data + "  ");
         head = head.next;
     }


        }


    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node y = new Node(6);
        Node z = new Node(7);
        Node b = new Node(8);
        a.next = y;
        y.next = z;
        z.next = b;
//        System.out.println(x.next.data);
//        System.out.println(y.next.data);
//        System.out.println(z.next.data);
//        System.out.println(x.next.next.data);
        // Node temp = a;
//        for(int i = 1;i<=4;i++){
//            System.out.println(temp.data + " ");
//            temp = temp.next;
//        }
//        while(temp !=null){ //printing the list
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
        display(a);


    }
}

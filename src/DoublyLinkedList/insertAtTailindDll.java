package DoublyLinkedList;

public class insertAtTailindDll {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    public static Node insertAtHD(Node head, int x){
        Node t= new Node(x);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }

    public static void insertAtTail(Node head, int x){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;

        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;



    }



    public static void display(Node random){
        Node temp = random;
        while(temp.prev != null){
            temp = temp.prev;
        }
        while(temp != null){
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        display(a);
        Node newHead = insertAtHD(a, 35);
        display(newHead);
        insertAtTail(b,90);
        display(a);




    }
}

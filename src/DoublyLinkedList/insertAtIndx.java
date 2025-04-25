package DoublyLinkedList;

public class insertAtIndx {
        public static class Node{
            int val;
            Node next;
            Node prev;
            Node(int val){
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

    public static Node  insertAtInd(Node head, int idx, int x) {
        if (idx == 0) {
            return insertAtHD(head, x);
        }

        Node s = head;
        for (int i = 1; i <= idx - 1; i++) {
            if (s == null) return head; // index out of bounds
            s = s.next;
        }

        if (s == null) return head; // index out of bounds

        if (s.next == null) {
            insertAtTail(head, x);
            return head;
        }

        Node r = s.next;
        Node t = new Node(x);
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;

        return head;
    }

    public static Node deleteAtInd(Node head, int idx) {
        if (head == null) return null;

        if (idx == 0) {
            Node newHead = head.next;
            if (newHead != null) {
                newHead.prev = null;
            }
            head = newHead;
            return head;
        }

        Node curr = head;
        for (int i = 0; i < idx; i++) {
            curr = curr.next;
            if (curr == null) return head; // index out of bounds
        }

        Node prevNode = curr.prev;
        Node nextNode = curr.next;

        if (prevNode != null) {
            prevNode.next = nextNode;
        }
        if (nextNode != null) {
            nextNode.prev = prevNode;
        }

        return head;
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

        Node head = a;

        System.out.print("Initial list: ");
        display(head);

        head = insertAtInd(head, 3, 56);  // Insert 56 at index 3
        System.out.print("After inserting 56 at index 3: ");
        display(head);

        head = insertAtInd(head, 0, 0);   // Insert 0 at head
        System.out.print("After inserting 0 at index 0: ");
        display(head);

        head = insertAtInd(head, 6, 14);  // Insert 14 at index 6 (tail position)
        System.out.print("After inserting 14 at index 6: ");
        display(head);

        head = deleteAtInd(head, 0);      // Delete head
        System.out.print("After deleting index 0: ");
        display(head);

        head = deleteAtInd(head, 2);      // Delete node at index 2
        System.out.print("After deleting index 2: ");
        display(head);

        head = deleteAtInd(head, 10);     // Attempt to delete out-of-bounds
        System.out.print("After attempting to delete out-of-bounds index 10: ");
        display(head);
    }

}

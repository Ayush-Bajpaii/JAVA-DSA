public class linkedListInAtHd {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedList{
        Node head = null;
        Node tail = null;


        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }

        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }



        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head==null){
               insertAtEnd( val);
            }
            else{
                temp.next = head;
                head = temp;
            }

        }

    }




    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(1);
        ll.display();
       // System.out.println();
        ll.insertAtEnd(2);
        ll.insertAtHead(0);
        ll.display();
     //   System.out.println();
        ll.insertAtEnd(3);
        ll.insertAtHead(-1);
        ll.display();

    }
}

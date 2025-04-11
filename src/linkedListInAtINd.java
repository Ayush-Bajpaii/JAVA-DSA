public class linkedListInAtINd {


    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class LinkedList{
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

        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head == null ){
                insertAtEnd(val);
            }
            else{
                temp.next = head;
                head = temp;
            }
        }

        void insertAt(int idx,int val ){
            if(idx == 0){
                insertAtHead(val);
                return;
            }

            if (idx == size()){
                insertAtEnd(val);
                return;
            }

            Node t = new Node(val);
            Node temp = head;
            for(int i = 1;i<=idx-1;i++){
                temp = temp.next;
            }
                t.next = temp.next;
                temp.next = t;
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
            while(temp!=null){
                count++;
                temp = temp.next;
            }

            return count;

        }

    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(0);
       // ll.display();
        ll.insertAtEnd(1);
       // ll.display();
        ll.insertAtHead(-1);
       // ll.display();
        ll.insertAtEnd(3);
        ll.insertAtHead(-2);
        // ll.display();
        ll.insertAtHead(-3);
        ll.display();
      //  System.out.println(ll.size());
        ll.insertAt(5,2);
        ll.display();
        System.out.println(ll.size());
        System.out.println(ll.tail.data);

    }
}

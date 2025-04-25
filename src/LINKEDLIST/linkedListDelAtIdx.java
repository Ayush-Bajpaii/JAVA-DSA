package LINKEDLIST;

public class linkedListDelAtIdx {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedList{
        Node head;
        Node tail;
        int size;

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
            size++;
        }


        void insertAtHead(int val){

            if(head == null){
                insertAtEnd(val);
                return;
            }
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;

        }

        void insertAt(int index, int val){
            if(index == 0){
                insertAtHead(val);
                return;
            }
            else if(index == size ){
                insertAtEnd(val);
                return;
            }
            else if(index <0 || index > size){
                System.out.println(index +" is wrong index.size of list is " + size + " \n");
                return;
            }
            else{
                Node t = new Node(val);
                Node temp = head;
                for(int i = 1; i <= index-1;i++){
                    temp =  temp.next;
                }
                t.next = temp.next;
                temp.next = t;
                size++;
            }
        }

        int getAt(int index){
            if(index <0 || index > size) {
                System.out.println(index + " is wrong index.size of list is " + size + " \n");
                return -1;
            }
            Node temp = head;
            for(int i = 1;i<= index;i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAt(int idx){
            if(idx == 0){
                head = head.next;
                size--;
                return;
            }
         Node temp = head;
         for(int i = 1; i <= idx-1; i++){
             temp = temp.next;
         }
         temp.next = temp.next.next;
         if(temp.next == null) {
             tail = temp;
         }
         size--;
        }

    }



    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtHead(0);
        ll.insertAtEnd(1);
        ll.insertAt(0,-1);
        ll.insertAt(2,3);
        ll.insertAt(4,2);
        ll.insertAt(5,5);
        ll.display();
        ll.deleteAt(0);
        ll.deleteAt(4);
        ll.deleteAt(2);

        ll.display();
        System.out.println(ll.head.data);
        System.out.println(ll.tail.data);
        System.out.println(ll.getAt(2));
    }
}

package LINKEDLIST;

public class linkedListGetAt {

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


        int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }

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
        }


        void insertAtHead(int val){

            if(head == null){
                insertAtEnd(val);
            }else{
                Node temp = new Node(val);
                temp.next = head;
                head = temp;
            }

        }

        void insertAt(int index, int val){
            if(index == 0){
                insertAtHead(val);
                return;
            }
            else if(index == size() ){
                insertAtEnd(val);
                return;
            }
            else if(index <0 || index > size()){
                System.out.println(index +" is wrong index.size of list is " + size() + " \n");
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

            }
        }

        int getAt(int index){
            if(index <0 || index > size()) {
                System.out.println(index + " is wrong index.size of list is " + size() + " \n");
                return -1;
            }
            Node temp = head;
            for(int i = 1;i<= index;i++){
                temp = temp.next;
            }
            return temp.data;
        }

    }



    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtHead(0);
        ll.display();
        ll.insertAtEnd(1);
        ll.display();
        System.out.println(ll.size());
        ll.insertAt(0,-1);
        ll.display();
        System.out.println(ll.size());
        System.out.println(ll.tail.data);
        System.out.println(ll.head.data);
        ll.insertAt(5,4);
        ll.display();
        ll.insertAt(-1,-2);
        ll.display();
        System.out.println(ll.getAt(0));

    }
}

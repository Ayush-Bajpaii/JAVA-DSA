package stacks;

public class LLimpOfStack {

    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }


    public static class LLStack{//user defined data structure
        private Node head = null;
        private int size = 0;

        void push(int x){
            Node temp = new Node (x);
            temp.next = head;
            head = temp;
            size++;
        }

        void displayrev(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val+ " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void displayRec(Node h){
            if(h == null) return;
            displayRec(h.next);
            System.out.print(h.val+ " " );
        }

        void display(){
            displayRec(head);
            System.out.println();
        }

        int size(){ //getter
            return size;
        }

        int pop(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is empty");
            }
            return head.val;
        }

        boolean isEmpty(){
            if(size == 0) return true;
            return false;
        }

    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
        st.push(5);
        st.display();
        System.out.println(st.size());
        st.push(1);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        st.push(7);
        st.push(9);
        st.push(3);
        st.display();

    }
}

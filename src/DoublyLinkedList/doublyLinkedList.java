package DoublyLinkedList;

public class doublyLinkedList {


        public static class Node {
            int data;
            Node next;
            Node prev;

            Node(int data) {
                this.data = data;
            }
        }

        public static class DoublyLinkedList {
            Node head = null;
            Node tail = null;

            void insertAtEnd(int val) {
                Node temp = new Node(val);
                if (head == null) {
                    head = temp;
                    tail = temp;
                } else {
                    tail.next = temp;
                    temp.prev = tail;
                    tail = temp;
                }
            }

            void insertAtHead(int val) {
                Node temp = new Node(val);
                if (head == null) {
                    insertAtEnd(val);
                } else {
                    temp.next = head;
                    head.prev = temp;
                    head = temp;
                }
            }

            void insertAt(int idx, int val) {
                if (idx == 0) {
                    insertAtHead(val);
                    return;
                } else if (idx == size()) {
                    insertAtEnd(val);
                    return;
                } else if (idx < 0 || idx > size()) {
                    System.out.printf(idx + " is wrong index. Size of LL is " + size() + "." + "\n");
                    return;
                }

                Node temp = head;
                for (int i = 1; i <= idx - 1; i++) {
                    temp = temp.next;
                }

                Node t = new Node(val);
                t.next = temp.next;
                t.prev = temp;
                temp.next.prev = t;
                temp.next = t;
            }

            void display() {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            }

            int size() {
                Node temp = head;
                int count = 0;
                while (temp != null) {
                    count++;
                    temp = temp.next;
                }
                return count;
            }
        }

        public static void main(String[] args) {
            DoublyLinkedList dll = new DoublyLinkedList();
            dll.insertAtEnd(0);
            dll.insertAtEnd(1);
            dll.insertAtHead(-1);
            dll.insertAtEnd(3);
            dll.insertAtHead(-2);
            dll.insertAtHead(-3);
            dll.insertAt(-1, 2);
            dll.insertAt(0, 5);
            dll.insertAt(9, 9);
            dll.display();
            System.out.println(dll.size());
            System.out.println(dll.tail.data);
            System.out.println(dll.head.data);
        }
    }


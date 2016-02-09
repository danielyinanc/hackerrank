package datastructures.linkedlists.printelements;

public class Solution {
    public static void main(String[] args) {
        //Print(null);
        Node n1 = new Node(3, null);
        Node n2 = new Node(2, n1);
        Node n3 = new Node(1, n2);
        //Print(n3);

        Node n4 = new Node(2, null);
        Insert(n4, 3);
        Print(n4);
    }

    static void Print(Node head) {
        if(head != null) {
            System.out.println(head.data);
            Node newHead = head.next;
            while(newHead != null) {
                System.out.println(newHead.data);
                newHead = newHead.next;
            }
        }
    }

    static Node Insert(Node head, int data) {
        if(head!= null) {
            Node prevHead = head.next;
            while(prevHead != null && prevHead.next != null ) {
                prevHead = prevHead.next;
            }

            Node newNode = new Node();
            newNode.data = data;

            if(prevHead == null) {
                head.next = newNode;
            } else {
                prevHead.next = newNode;
            }
        }

        return head;
    }

    static Node InsertToHead(Node head, int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        return newNode;
    }
}

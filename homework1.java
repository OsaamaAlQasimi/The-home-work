package HomeWork_one;

/*
====================================================
        Data Structure - Assignment 1
        Name   : Asama Al-Qasimi
        Group  : three
====================================================


*/

public class Hoome {
    public static void main(String[] args) {

        /*
        ====================================================
                        Question 1
                    Clone an Array
        ====================================================
//        */
//
//        int[] original = {1, 2, 3, 4, 5};
//        int[] clone = original.clone();
//
//        for (int i : clone)
//            System.out.print(i + " ");



        /*
        ====================================================
                        Question 3
              Remove Specific Element from Array
        ====================================================
        */

        int[] arr = {10, 20, 30, 40, 50};
        int element = 30;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            }
        }

        for (int i = 0; i < arr.length - 1; i++)
            System.out.print(arr[i] + " ");



        /*
        ====================================================
                        Question 7
          Search for element in Singly Linked List
        ====================================================
        */
        /*
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println(SearchSLL.search(head, 20));
        */

    }
}

/*
====================================================
            Node Class (SLL & CLL)
====================================================
*/
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

/*
====================================================
                Question 5
      Concatenate Two Singly Linked Lists
====================================================
*/
class ConcatenateLinkedList {
    static Node concatenate(Node head1, Node head2) {
        if (head1 == null) return head2;

        Node temp = head1;
        while (temp.next != null)
            temp = temp.next;

        temp.next = head2;
        return head1;
    }
}

/*
====================================================
                Question 7
      Search in Singly Linked List
====================================================
*/
class SearchSLL {
    static int search(Node head, int key) {
        int position = 1;
        Node temp = head;

        while (temp != null) {
            if (temp.data == key)
                return position;
            temp = temp.next;
            position++;
        }
        return -1;
    }
}

/*
====================================================
                Question 9
 Remove Node at Specific Position (SLL)
====================================================
*/
class RemoveAtPosition {
    static Node remove(Node head, int pos) {
        if (head == null || pos == 1)
            return head.next;

        Node temp = head;
        for (int i = 1; i < pos - 1; i++)
            temp = temp.next;

        temp.next = temp.next.next;
        return head;
    }
}

/*
====================================================
            Doubly Linked List Node
====================================================
*/
class DNode {
    int data;
    DNode prev, next;

    DNode(int data) {
        this.data = data;
    }
}

/*
====================================================
                Question 11
   Traverse Doubly Linked List in Reverse
====================================================
*/
class ReverseDLL {
    static void traverse(DNode tail) {
        while (tail != null) {
            System.out.print(tail.data + " ");
            tail = tail.prev;
        }
    }
}

/*
====================================================
                Question 13
 Insert Node at Position (Circular LL)
====================================================
*/
class InsertCircular {
    static Node insert(Node head, int data, int pos) {
        Node newNode = new Node(data);

        if (pos == 1) {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;

            temp.next = newNode;
            newNode.next = head;
            return newNode;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1; i++)
            temp = temp.next;

        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
}

/*
====================================================
                Question 15
   Search Element in Circular Linked List
====================================================
*/
class SearchCircular {
    static boolean search(Node head, int key) {
        Node temp = head;
        do {
            if (temp.data == key)
                return true;
            temp = temp.next;
        } while (temp != head);

        return false;
    }
}
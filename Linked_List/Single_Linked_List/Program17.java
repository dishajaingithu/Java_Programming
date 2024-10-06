/*
	Remove the Duplicates from List
        i/p : 12 -> 11 -> 21 -> 41 -> 43 -> 20 -> null
              11 -> 12 -> 12 -> 21 -> 41 -> 43 -> null

        o/p : 11 -> 12 -> 21 -> 41 -> 43 -> null
*/
import java.util.*;
class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
class LinkedListMergeSortAndRemoveDuplicates {

    static ListNode sortAndRemoveDuplicates(ListNode head) {
        head = mergeSort(head);
        head = removeDuplicates(head);
        return head;
    }

    static ListNode mergeSort(ListNode head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        ListNode mid = findMiddle(head);
        ListNode rightHead = mid.getNext();
        mid.setNext(null); 

        ListNode left = mergeSort(head);
        ListNode right = mergeSort(rightHead);
        return merge(left, right);
    }

    static ListNode findMiddle(ListNode head) {
        if (head == null) return head;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.getNext() != null && fast.getNext().getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        return slow;
    }

    static ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (left != null && right != null) {
            if (left.getData() <= right.getData()) {
                tail.setNext(left);
                left = left.getNext();
            } else {
                tail.setNext(right);
                right = right.getNext();
            }
            tail = tail.getNext();
        }
        if (left != null) {
            tail.setNext(left);
        } else if (right != null) {
            tail.setNext(right);
        }
        return dummy.getNext();
    }

    static ListNode removeDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.getNext() != null) {
            if (current.getData() == current.getNext().getData()) {
                current.setNext(current.getNext().getNext());
            } else {
                current = current.getNext();
            }
        }
        return head;
    }
    static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.setNext(new ListNode(3));
        head.getNext().setNext(new ListNode(2));
        head.getNext().getNext().setNext(new ListNode(2));
        head.getNext().getNext().getNext().setNext(new ListNode(5));
        head.getNext().getNext().getNext().getNext().setNext(new ListNode(1));
        head.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(4));

        System.out.println("Original List:");
        printList(head);
        head = sortAndRemoveDuplicates(head);

        System.out.println("Sorted List after removing duplicates:");
        printList(head);
    }
}

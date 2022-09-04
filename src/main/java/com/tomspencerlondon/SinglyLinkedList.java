package com.tomspencerlondon;

public class SinglyLinkedList {
  ListNode head;
  ListNode tail;

  public static void main(String[] args) {
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    ListNode second = new ListNode(1);
    ListNode third = new ListNode(8);
    ListNode fourth = new ListNode(11);
//    Now we will connect them together to form a chain
    singlyLinkedList.head.next = second; // 10 --> 1
    second.next = third; // 10 --> 1 --> 8
    third.next = fourth; // 10 --> 1 --> 8 --> 11
    singlyLinkedList.print();
  }

  public SinglyLinkedList() {
    head = new ListNode(10);
    tail = head;
  }

  public void insertEnd(int index) {
    int i = 0;
    ListNode curr = head;
    while (i < index && curr != null) {
      i++;
      curr = curr.next;
    }

    // Remove the node ahead of curr
    if (curr != null) {
      curr.next = curr.next.next;
    }
  }

  public void print() {
    System.out.println(head.val + " -> ");
    ListNode curr = head.next;
    while (curr != null) {
      System.out.println(curr.val + " -> ");
      curr = curr.next;
    }

    System.out.println();
  }
}

class ListNode {
  int val;
  ListNode next;

  public ListNode(int val) {
    this.val = val;
    this.next = null;
  }
}
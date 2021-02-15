package com.imp.CompanyInterview.SmileCDR.LinkList;
/*
* Reverse a singly linked list.
* */

import java.util.Stack;

/**
  Definition for singly-linked list.*/
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null)return head;
        Stack<ListNode> reversResult=new Stack<>();
        reversResult.push(head);
        while (head.next!=null){
            head = head.next;
            reversResult.push(head);
        }
        reversResult.iterator().forEachRemaining(c->System.out.print(c.val));
        ListNode h=reversResult.pop();
        ListNode c=h;
        while (!reversResult.isEmpty()){
                ListNode nextNode=reversResult.pop();
                c.next=nextNode;
                c=nextNode;
        }
        c.next=null;
        return h;
    }
    public ListNode reverseListWithoutExtraMemory(ListNode head) {
        // is there something to reverse?
        if (head != null && head.next != null)
        {
            ListNode pivot = head;
            ListNode frontier = null;
            while (pivot != null && pivot.next != null)
            {
                frontier = pivot.next;
                pivot.next = pivot.next.next;
                frontier.next = head;
                head = frontier;
            }
        }

        return head;
    }
}

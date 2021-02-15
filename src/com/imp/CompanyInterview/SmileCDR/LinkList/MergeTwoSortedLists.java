package com.imp.CompanyInterview.SmileCDR.LinkList;

/*
 * Merge two sorted linked lists and return it as a sorted list.
 * The list should be made by splicing together the nodes of the first two lists.
 * Input: l1 = [1,2,4], l2 = [1,3,4],Output: [1,1,2,3,4,4]
 *
 * */

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            if (l2 == null)
                return null;
            else
                return l2;
        } else if (l2 == null)
            return l1;
        ListNode headResult = null;
        ListNode followUp = null;
        if (l1.val < l2.val) {
            headResult = l1;
            l1 = l1.next;
        } else {
            headResult = l2;
            l2 = l2.next;
        }
        followUp = headResult;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                followUp.next = l2;
                break;
            } else if (l2 == null) {
                followUp.next = l1;
                break;
            }
            if (l1.val < l2.val) {
                followUp.next = l1;
                l1 = l1.next;
                followUp = followUp.next;
            } else {
                followUp.next = l2;
                l2 = l2.next;
                followUp = followUp.next;
            }

        }
        return headResult;
    }

}

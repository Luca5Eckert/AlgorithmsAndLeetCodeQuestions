package leetcode.mergeTwoSortedLists;

import leetcode.isPalindrome.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        if(list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }



    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(4);

        listNode1.addNext(listNode2);
        listNode2.addNext(listNode3);

        ListNode listNode11 = new ListNode(1);
        ListNode listNode12 = new ListNode(2);
        ListNode listNode13 = new ListNode(4);

        listNode11.addNext(listNode12);
        listNode12.addNext(listNode13);

        s.mergeTwoLists(listNode1, listNode11);
    }
}
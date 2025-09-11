package leetcode.linkedListCycle;

import leetcode.isPalindrome.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;

        Set<ListNode> nodes = new HashSet<>();

        while(head != null){
            nodes.add(head);

            if(nodes.contains(head.next)){
                return true;
            }
            head = head.next;
        }

        return false;
    }
}
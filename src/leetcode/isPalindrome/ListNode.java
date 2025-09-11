package leetcode.isPalindrome;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int valor ){
        this.val = valor;
    }

    public ListNode next(){
        return next;
    }

    public boolean hasNext(){
        return next != null;
    }

    public void addNext(ListNode listNode){
        this.next = listNode;
    }

}

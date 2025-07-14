package isPalindrome;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//This is the resolution question 234 of the leetcode- Is palindrome
public class Resolution {

    public static boolean isPalindromeEasy(ListNode listNode){
        List<Integer> list = new ArrayList<>();

        while(listNode != null){
            list.add(listNode.valor);
            listNode = listNode.next();
        }

        int temp = 0;
        for(int i = 0; i < list.size()/2; i++){
            if(list.get(i) == list.get(list.size() - i -1 )){
                temp++;
            }
        }
        if (temp == list.size()/2) return true;
        return false;
    }


    public static boolean isPalindromeTest(){
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(1);

        listNode1.addNext(listNode2);
        listNode2.addNext(listNode3);
        listNode3.addNext(listNode4);

        boolean result = isPalindromeOn(listNode1);

        return result == true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeTest());
    }

}

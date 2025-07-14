package isPalindrome;

public class ListNode {
    int valor;
    ListNode listNode;

    public ListNode(int valor ){
        this.valor = valor;
    }

    public ListNode next(){
        return listNode;
    }

    public boolean hasNext(){
        return listNode != null;
    }

    public void addNext(ListNode listNode){
        this.listNode = listNode;
    }

}

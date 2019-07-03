package medium;

public class P2_Add_two_numbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int tmp = 0;
        ListNode result = null;
        ListNode head = null;
        while(l1 != null || l2 != null || tmp!= 0) {
            int value = (l1 != null ? l1.val : 0 ) + (l2!= null? l2.val : 0) + tmp;
            if(result == null) {
                result = new ListNode(value % 10);
                head = result;
            } else
                result.next = new ListNode(value % 10);
            tmp = value/10;
            l1 = l1 != null ? l1.next : null;
            l2 = l2!= null ? l2.next : null;
            result = result.next != null ? result.next : result;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
package medium;

import java.math.BigInteger;

public class P445_Add_two_numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return createListNode(getNumber(l1).add(getNumber(l2)));
    }

    private BigInteger getNumber(ListNode node) {
        StringBuffer sb = new StringBuffer();
        while(node != null) {
            sb.append(node.val);
            node = node.next;
        }
       return new BigInteger(sb.toString());
    }

    private ListNode createListNode(BigInteger value) {
        if(value.equals(BigInteger.ZERO))
            return new ListNode(0);
        ListNode result = null;
        while(!value.equals(BigInteger.ZERO)) {
            int val = value.mod(BigInteger.valueOf(10l)).intValue();
            value = value.divide(BigInteger.valueOf(10l));
            if(result == null)
                result = new ListNode(val);
            else {
                ListNode node = new ListNode(val);
                node.next = result;
                result = node;
            }
        }
        return result;
    }

    private int length(ListNode node) {
        int len = 0;
        while (node != null) {
            len++;
            node = node.next;
        }
        return len;
    }




}

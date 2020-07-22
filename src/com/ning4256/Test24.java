package com.ning4256;

public class Test24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null && current.next.next != null) {
            swap(current);
            current = current.next.next;
        }

        return dummy.next;
    }

    private void swap(ListNode preNode) {
        ListNode tmp = preNode.next;
        preNode.next = tmp.next;
        tmp.next = tmp.next.next;
        preNode.next.next = tmp;
    }
}

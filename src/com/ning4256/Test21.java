package com.ning4256;

public class Test21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null && l2 != null) {
            boolean flag = (l1.val < l2.val);
            cur.next = flag ? l1 : l2;
            cur = cur.next;
            l1 = flag ? l1.next : l1;
            l2 = flag ? l2 : l2.next;
        }
        cur.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }
}

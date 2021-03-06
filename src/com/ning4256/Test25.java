package com.ning4256;

import sun.swing.plaf.synth.DefaultSynthStyle;

public class Test25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        ListNode prenode =dummy;
        dummy.next = head;

        while (prenode != null) {
            prenode = change(prenode, k);
        }

        return dummy.next;

    }

    private ListNode change(ListNode prenode, int k) {
        ListNode lastnode = prenode;
        for (int i = 0; i < k + 1; i++) {
            lastnode = lastnode.next;
            if(i != k && lastnode == null)
                return null;
        }
        ListNode tail = prenode.next;
        ListNode curr = prenode.next.next;
        while (curr != lastnode) {
            ListNode tmp = curr.next;
            curr.next = prenode.next;
            prenode.next = curr;
            tail.next = tmp;
            curr = tmp;
        }
        return tail;
    }
}

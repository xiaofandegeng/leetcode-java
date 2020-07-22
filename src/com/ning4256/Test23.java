package com.ning4256;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Test23 {

    class NodeComparator implements Comparator<ListNode>{

        @Override
        public int compare(ListNode o1, ListNode o2) {
            return o1.val - o2.val;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        if(lists.length == 0 || lists == null)
            return dummy.next;

        ListNode cur = dummy;
        NodeComparator cmp = new NodeComparator();
        PriorityQueue<ListNode> queue = new PriorityQueue(cmp);

        for (int i = 0; i < lists.length; i++) {
            if(lists[i] != null)
                queue.add(lists[i]);
        }
        while (queue.size() != 0) {
            ListNode poll = queue.poll();
            cur.next = poll;
            cur = cur.next;
            if (poll.next != null) {
                queue.add(poll.next);
            }
        }
        return dummy.next;
    }
}

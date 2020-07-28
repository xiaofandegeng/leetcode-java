package com.ning4256;

import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }

public class Test02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //初始化 一个前置节点
        ListNode dummy = new ListNode(0);
        //当前指针指向dummy
        ListNode curr = dummy;
        //如果首位进1的判断
        int carry = 0;
        //循环拼接
        while (l1 != null || l2 != null) {
            // 如何l1和l2不为空，只用他俩的值加减，否则当作0处理
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
            // 获得value的值
            int val = sum % 10;
            // 判断是否进位
            carry = sum / 10;
            // 将下一节点连接，且移动当前节点
            ListNode newNode = new ListNode(val);
            curr.next = newNode;
            curr = curr.next;
            // 移动l1,l2两个节点
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        // 当发生进位的时候
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummy.next;
    }
}

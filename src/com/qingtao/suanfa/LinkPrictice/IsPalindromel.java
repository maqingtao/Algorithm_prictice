package com.qingtao.suanfa.LinkPrictice;

import java.util.Stack;

/**
 * @Author: maqingtao
 * @description: 判断一个链表是不是回文
 * @create: 2018/9/26
 **/

public class IsPalindromel {
    class Node {
        public int value;
        public Node next;
    }

    /**
     * @Author: maqingtao
     * @description: 利用栈先进后出的原理
     * @create: 2018/9/26
     **/

    public boolean isPalindromel(Node head) {
        Node temp = head;
        Stack<Integer> stack = new Stack();
        while (temp != null) {
            stack.push(temp.value);
            temp = temp.next;
        }
        while (head != null) {
            if (stack.pop() != head.value) {
                return false;
            }
        }
        return true;
    }
}

package com.qingtao.suanfa.LinkPrictice;

import java.util.HashMap;
import java.util.Map;

public class LinkReverse {
    class Node {
        private int value;
        private Node next;

        Node(Integer value) {
            this.value = value;
        }
    }

    private Node head;
    private Node h;

    public void addNode(Integer a) {
        if (head == null) {
            head = new Node(a);
            h = head;
        } else {
            Node newNode = new Node(a);
            head.next = newNode;
            head = head.next;
        }
    }

    public void getReverseNode() {
        Map ha=new HashMap();
        Node nodes = h;
        Node pre = null;
        Node next = null;
        while (nodes != null) {
            next = nodes.next;
            nodes.next = pre;
            pre=nodes;
            nodes = next;
        }
        while (pre != null) {
            System.out.println(pre.value);
            pre =pre.next;
        }
    }

    public void printNode() {
        Node A = h;
        while (A != null) {
            System.out.println(A.value);
            A = A.next;
        }
    }

    public static void main(String[] args) {
        LinkReverse linkReverse = new LinkReverse();
        linkReverse.addNode(1);
        linkReverse.addNode(2);
        linkReverse.addNode(3);
        linkReverse.addNode(4);
//        linkReverse.printNode();
        linkReverse.getReverseNode();
//        linkReverse.printNode();
        System.out.println("");
    }

}

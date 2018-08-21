package com.qingtao.linkTable;

public class Linklist {
    class Node {
        private int value;
        private Node next;
    }

    private Node head;

    //头插法
    public void addHead(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    //尾插法
    public void addTail(int value) {
        Node node = new Node();
        node.value = value;
        Node p = head;
        if (head == null) {
            node.next = head;
            head = node;
        } else {
            while (p.next != null) {
                p = p.next;
            }
            node.next = p.next;
            p.next = node;
        }
    }

    public void removeNode() {

    }

    public void printLink() {
        while (head != null) {
            System.out.print(head.value);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Linklist linklist = new Linklist();
        linklist.addHead(1);
        linklist.addHead(2);
        linklist.addHead(3);
        linklist.printLink();
        System.out.println();
        System.out.println("----------------------------");
        Linklist linklist1 = new Linklist();
        linklist1.addTail(1);
        linklist1.addTail(2);
        linklist1.addTail(3);
        linklist1.printLink();

    }
}

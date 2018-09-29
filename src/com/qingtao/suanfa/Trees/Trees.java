package com.qingtao.suanfa.Trees;

import java.util.Stack;

/**
 * @Author: maqingtao
 * @description:
 * @create: 2018/9/28
 **/

public class Trees {
    /**
     * @Author: maqingtao
     * @description: 树结构
     * @create: 2018/9/28
     **/

    class TreeNode<T> {
        T data;

        public TreeNode(T data, TreeNode<T> left, TreeNode<T> right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        TreeNode<T> left;
        TreeNode<T> right;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public TreeNode<T> getLeft() {
            return left;
        }

        public void setLeft(TreeNode<T> left) {
            this.left = left;
        }

        public TreeNode<T> getRight() {
            return right;
        }

        public void setRight(TreeNode<T> right) {
            this.right = right;
        }


    }

    /**
     * @Author: maqingtao
     * @description: 构造二叉树
     * @create: 2018/9/28
     **/

    public TreeNode<String> init() {
        TreeNode<String> D = new TreeNode<String>("D", null, null);
        TreeNode<String> H = new TreeNode<String>("H", null, null);
        TreeNode<String> I = new TreeNode<String>("I", null, null);
        TreeNode<String> J = new TreeNode<String>("J", null, null);
        TreeNode<String> P = new TreeNode<String>("P", null, null);
        TreeNode<String> G = new TreeNode<String>("G", P, null);
        TreeNode<String> F = new TreeNode<String>("F", null, J);
        TreeNode<String> E = new TreeNode<String>("E", H, I);
        TreeNode<String> B = new TreeNode<String>("B", D, E);
        TreeNode<String> C = new TreeNode<String>("C", F, G);
        TreeNode<String> A = new TreeNode<String>("A", B, C);
        return A;
    }

    /**
     * @Author: maqingtao
     * @description: 递归先序遍历
     * @create: 2018/9/28
     **/

    public void xianxu(TreeNode<String> node) {
        System.out.print(node.getData() + " ");
        if (node.left != null) {
            xianxu(node.left);
        }
        if (node.right != null) {
            xianxu(node.right);
        }

    }

    /**
     * @Author: maqingtao
     * @description: 先序遍历非递归实现
     * @create: 2018/9/29
     **/
    public void xianxu1(TreeNode<String> node) {
        if (node != null) {
            Stack<TreeNode<String>> stack = new Stack<TreeNode<String>>();
            stack.add(node);
            while (!stack.isEmpty()) {
                node = stack.pop();
                System.out.print(node.getData() + " ");
                if (node.right != null) {
                    stack.add(node.right);
                }
                if (node.left != null) {
                    stack.add(node.left);
                }
            }
        }
    }

    /**
     * @Author: maqingtao
     * @description: 递归中序遍历
     * @create: 2018/9/28
     **/
    public void zhongxu(TreeNode<String> node) {
        if (node.left != null) {
            zhongxu(node.left);
        }
        System.out.print(node.getData() + " ");
        if (node.right != null) {
            zhongxu(node.right);
        }
    }

    /**
     * @Author: maqingtao
     * @description: 中序非递归实现
     * @create: 2018/9/29
     **/
    public void zhongxu1(TreeNode<String> node) {
        if (node != null) {
            Stack<TreeNode<String>> stack = new Stack<TreeNode<String>>();
            while (!stack.isEmpty() || node != null) {
                if (node != null) {
                    stack.push(node);
                    node = node.left;
                } else {
                    node = stack.pop();
                    System.out.print(node.getData() + " ");
                    node = node.right;
                }
            }
        }
    }

    /**
     * @Author: maqingtao
     * @description: 递归后序遍历
     * @create: 2018/9/28
     **/
    public void houxu(TreeNode<String> node) {
        if (node.left != null) {
            houxu(node.left);
        }
        if (node.right != null) {
            houxu(node.right);
        }
        System.out.print(node.getData() + " ");
    }

    /**
     * @Author: maqingtao
     * @description: 后序非递归
     * @create: 2018/9/29
     **/
    public void houxu1(TreeNode<String> node) {
        if (node != null) {
            Stack<TreeNode<String>> s1 = new Stack<TreeNode<String>>();
            Stack<TreeNode<String>> s2 = new Stack<TreeNode<String>>();
            s1.push(node);
            while (!s1.isEmpty()) {
                node = s1.pop();
                s2.push(node);
                if (node.left != null) {
                    s1.push(node.left);
                }
                if (node.right != null) {
                    s1.push(node.right);
                }
            }
            while (!s2.isEmpty()) {

                System.out.print(s2.pop().getData() + " ");
            }
        }
    }

    public static void main(String[] args) {
        Trees t = new Trees();
        TreeNode<String> node = t.init();
        t.xianxu(node);
        System.out.println();
        System.out.println("--------------------------------------------");
        t.zhongxu(node);
        System.out.println();
        System.out.println("--------------------------------------------");
        t.houxu(node);
        System.out.println();
        System.out.println("-------------------先序非递归----------------");
        t.xianxu1(node);
        System.out.println();
        System.out.println("-------------------中序非递归----------------");
        t.zhongxu1(node);
        System.out.println();
        System.out.println("-------------------后序非递归----------------");
        t.houxu1(node);
    }
}

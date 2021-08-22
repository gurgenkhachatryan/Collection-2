package com.company.BinarySerchTree;

import java.util.PriorityQueue;

public class MyBinarySearchTree {
    Node root;

    public void add(Integer value) {
        root = addRecursion(root, value);
    }

    public Node addRecursion(Node current, Integer value) {
        if (current == null) {
            return new Node(value);
        }
        if (current.value > value) {
            current.left = addRecursion(current.left, value);
        }
        if (current.value < value) {
            current.right = addRecursion(current.right, value);
        }
        return current;
    }

    public boolean contains(Integer value) {
        return (find(root, value) != null);
    }

    public Node find(Node current, Integer value) {
        if (current == null) {
            return null;
        }
     if(current.value.equals(value))
     {
         return current;
     }
         if (current.value > value) {
            return find(current.left, value);
        }
         if (current.value < value) {
            return find(current.right, value);
        }
            return current;

    }

    public void inorder(){
        inorder(root);
    }
    private void inorder(Node current){
        if(current != null){
            inorder(current.left);
            System.out.print(current.value + " ");
            inorder(current.right);
        }
    }



    public void preorder()
    {
        preorder(root);
    }
    private void preorder(Node current)
    {
        if(current!=null)
        {
            System.out.println(current.value + " ");
            preorder(current.left);
            preorder(current.right);
        }
    }
    public  void postorder()
    {
        postorder(root);
    }
    private void postorder(Node current)
    {
        if(current!=null)
        {
            postorder(current.left);
            postorder(current.right);
            System.out.print(current.value + " ");

        }
    }


    public int minValue()
    {
        Node node=root;
        while (node.left!=null)
        {
            node=node.left;
        }
        return node.value;
    }

    public int maxValue()
    {
        Node node=root;
        while ((node.right!=null))
        {
            node=node.right;
        }
        return node.value;
    }

    public void levelorder()
    {
         levelorder(root);
    }

    private void levelorder(Node current)
    {
        PriorityQueue<Node> myQueue=new PriorityQueue<>();

    }




}

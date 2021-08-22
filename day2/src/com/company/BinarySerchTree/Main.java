package com.company.BinarySerchTree;

public class Main {
    public static void main(String[] args) {
        MyBinarySearchTree myBinarySearchTree=new MyBinarySearchTree();
        myBinarySearchTree.add(7);
        myBinarySearchTree.add(2);
        myBinarySearchTree.add(4);
  //      myBinarySearchTree.add(2);
        myBinarySearchTree.add(6);
        myBinarySearchTree.add(58);
        //myBinarySearchTree.add(10);
      //  System.out.println(myBinarySearchTree.toString());
        System.out.println(myBinarySearchTree.contains(50));
        myBinarySearchTree.inorder();
        System.out.println();
        System.out.println(myBinarySearchTree.minValue());
        System.out.println(myBinarySearchTree.maxValue());
        myBinarySearchTree.postorder();

    }
}

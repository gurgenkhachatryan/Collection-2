package com.company.HomeBinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.add(50);
        binaryTree.add(35);
        binaryTree.add(75);
        binaryTree.add(60);
        binaryTree.add(80);
        binaryTree.add(25);
        binaryTree.add(40);
        binaryTree.add(38);
        binaryTree.add(48);
        binaryTree.add(60);
        binaryTree.add(80);
//        System.out.println("value = 20 ==> " + binaryTree.find(20));
//        System.out.print("inorder =");
//        binaryTree.inorder();
//        System.out.println();
//        System.out.print("preorder=");
//        binaryTree.preorder();
//        System.out.println();
//        System.out.print("postorder=");
//        binaryTree.postorder();
//        System.out.println();
//        System.out.println("min= " + binaryTree.minimum());
//        System.out.println("max= " + binaryTree.maximum());
     //   binaryTree.remEl(35);
binaryTree.removeElement(50);
    }
}

package com.company.HomeBinarySearchTree;

import java.util.PriorityQueue;

public class BinaryTree {
    Node root;

    public void add(Integer value) {
        root = (addRecursion(root, value));
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


    public boolean find(Integer value) {
        return (find(root, value) != null);
    }


    public Node find(Node current, Integer value) {
        if (current == null) {
            return null;
        }
        if (current.value.equals(value)) {
            return current;
        }
        if (current.value > value) {
            return find(current.left, value);
        }
        return find(current.right, value);

    }

    public void inorder() {
        inorderRecursion(root);
    }

    public Node inorderRecursion(Node current) {
        if (current == null) {
            return null;
        }
        inorderRecursion(current.left);
        System.out.print(current.value + " ");
        inorderRecursion(current.right);
        return current;
    }

    public void preorder() {
        preorderRecursion(root);
    }

    public Node preorderRecursion(Node current) {
        if (current == null) {
            return null;
        }
        System.out.print(current.value + " ");
        preorderRecursion(current.left);
        preorderRecursion(current.right);
        return current;
    }

    public void postorder() {
        postorderRecursion(root);
    }

    public Node postorderRecursion(Node current) {
        if (current == null) {
            return null;
        }
        postorderRecursion(current.left);
        postorderRecursion(current.right);
        System.out.print(current.value + " ");
        return current;
    }

    public int minimum() {
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.value;

    }

    public int maximum() {
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.value;
    }

    public void levelOrder() {
        levelOrderRecursion(root);
    }

    public void levelOrderRecursion(Node current) {
        PriorityQueue<Integer> myQueue = new PriorityQueue<>();


    }


    public void remove(Integer value) {
        removeEl(root, value);
    }

    public Node removeRecRight(Node current) {
        if (current.right == null) {
            return current;
        }
        return removeRecRight(current.right);

    }

    public void removeEl(Node current, Integer value) {
        if (current == null) {
            return;
        }
        if(current.value.compareTo(value)==0)
        {
            if(current.left.right!=null)
            {
                Node res=removeRecRight(current.left);
                res.right=current.right;
                root=current.left;
                current.left=null;
                current.right=null;
                return;
            }
            else
            {
                current.left.right=current.right;
            }
        }
        if (current.left.value.compareTo(value) == 0) {
            if (current.left.left != null) {
                Node res = removeRecRight(current.left.left);
                res.right = current.left.right;
                current.left = current.left.left;
                return;
            }
            if (current.left.right != null) {
                current.left = current.left.right;
                return;
            }
            current.left = null;
            if (current.right.value.compareTo(value) == 0) {
                if (current.right.left != null) {
                    Node res = removeRecRight(current.right.left);
                    res.right = current.right.right;
                    current.right = current.right.left;
                    return;

                }
                if (current.right.right != null) {
                    current.right = current.right.right;
                    return;
                }
                current.right = null;
               if (current.value.compareTo(value) == 1) {
                    removeEl(current.left, value);
                    return;
                } else {
                    removeEl(current.right, value);
                }
                if (current.value.compareTo(value) == 0) {
                    if (current.left.right != null) {
                        Node res = removeRecRight(current.right);
                        res.right = current.right;
                        return;
                    }
                }

            }
        }
    }


//    public  void remove(Integer value)
//    {
//        recRemove(root,value);
//    }
//    public  Node recRight(Node root)
//    {
//        Node lastRight=root;
//        if(root.right!=null)
//        {
//            lastRight=recRight(root.right);
//        }
//        return lastRight;
//    }
//    public void gtel(Node root,Integer value)
//    {
//        if(root.value==value)
//        {
//            Node newRight=root.right;
//            root=root.left;
//           Node n= recRight(root.left);
//           n=newRight;
//
//        }
//    }
public Node recRight(Node current)
{
   if(current.right!=null)
   {
       return recRight(current.right);
   }
   else
        return current;


}

    public void removeElement(Integer value)
    {
        if(value== root.value)
        {
            Node n=recRight(root.left);
            n=root.right;
            root=root.left;
        }
    }

}
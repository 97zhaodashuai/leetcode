package com.example.leetaccode;

import java.util.ArrayList;
import java.util.List;

import sun.reflect.generics.tree.Tree;

public class problem_101 {

    TreeNode root;

    public void main(){
        int[] arr = {1,2,2, -65535, 3, -65535, 3};
        root = create_tree(arr, arr.length, 0);
        boolean ret = isSymmetric(root);
        print(ret);
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        List<TreeNode>  leftlist = new ArrayList<>();
        List<TreeNode>  rightlist = new ArrayList<>();


        leftlist.add(root.left);
        rightlist.add(root.right);

        while (!leftlist.isEmpty()){

            if(leftlist.size() != rightlist.size()){
                return false;
            }
            ArrayList<TreeNode> tmpleft = new ArrayList<TreeNode>();
            ArrayList<TreeNode> tmpright = new ArrayList<TreeNode>();
            for(int i = 0;i < leftlist.size(); i++){

                TreeNode leftnode = leftlist.get(i);
                TreeNode rightnode = rightlist.get(i);
                if(leftnode != null && rightnode != null &&(
                        (leftnode.left != null && rightnode.right == null) || (leftnode.left == null && rightnode.right != null) )){
                    return false;
                }


                if(leftnode != null && rightnode != null &&  leftnode.left != null && rightnode.right != null &&  leftnode.left.val != rightnode.right.val){
                    return false;
                }


                if(leftnode != null && rightnode != null &&(
                        (leftnode.right != null && rightnode.left == null) || (leftnode.right == null && rightnode.left != null) )){
                    return false;
                }



                if(leftnode != null && rightnode != null && leftnode.right != null && rightnode.left !=null && leftnode.right.val != rightnode.left.val){
                    return false;
                }


                if(leftnode != null && leftnode.left != null){
                    tmpleft.add(leftnode.left);
                }

                if(leftnode != null && leftnode.right != null){
                    tmpleft.add(leftnode.right);
                }


                if(rightnode!= null && rightnode.right != null){
                    tmpright.add(rightnode.right);
                }


                if(rightnode != null && rightnode.left != null){
                    tmpright.add(rightnode.left);
                }

            }

            leftlist = tmpleft;
            rightlist = tmpright;
        }
        return  true;

    }







    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    private TreeNode create_tree(int[] arr, int len, int index ){

        if(index >= len) return null;
        if(arr[index] == -65535){
            return null;
        }
        TreeNode node = new TreeNode(arr[index]);
        node.left = create_tree(arr, len, index * 2 + 1);
        node.right = create_tree(arr, len, index * 2 + 2);
        return node;
    }




    public boolean leveltraversal(TreeNode root) {

        List<TreeNode>  leftlist = new ArrayList<>();
        List<TreeNode>  rightlist = new ArrayList<>();


        leftlist.add(root.left);
        rightlist.add(root.right);

        while (!leftlist.isEmpty()){

            if(leftlist.size() != rightlist.size()){
                return false;
            }
            ArrayList<TreeNode> tmpleft = new ArrayList<TreeNode>();
            ArrayList<TreeNode> tmpright = new ArrayList<TreeNode>();
            for(int i = 0;i < leftlist.size(); i++){

                TreeNode leftnode = leftlist.get(i);
                TreeNode rightnode = rightlist.get(i);
                if(leftnode.left.val != rightnode.right.val){
                    return false;
                }


                if(leftnode.left != null){
                    tmpleft.add(leftnode.left);
                }

                if(leftnode.right != null){
                    tmpleft.add(leftnode.right);
                }


                if(rightnode.right != null){
                    tmpright.add(rightnode.right);
                }


                if(rightnode.left != null){
                    tmpright.add(rightnode.left);
                }

            }

            leftlist = tmpleft;
            rightlist = tmpright;
        }
        return  true;
    }




    public void print(int i){
        System.out.println(i + " ");
    }



    public void print(boolean i){
        System.out.println("boolean " + i);
    }





}

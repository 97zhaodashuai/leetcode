package com.example.leetaccode;

import java.util.ArrayList;
import java.util.List;

public class problem_102 extends ProblemBinaryTreeBase {

    TreeNode root;

    public void main(){
        int[] arr = {1,2,2, -65535, 3, -65535, 3};
        root = create_tree(arr, arr.length, 0);

        List<List<Integer>> ret = levelOrder(root);



        for(int i = 0; i < ret.size(); i++){
            int[]  it = new int[ret.get(i).size()];

            List<Integer> tmp = ret.get(i);
            for (int j = 0; j < tmp.size(); j++) {
                it[j] = tmp.get(j);
            }




        }



    }




    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) {
            return null;
        }
        List<TreeNode> list = new ArrayList<TreeNode>();
        list.add(root);

        List<List<Integer>> ret = new ArrayList<List<Integer>>();

        while (!list.isEmpty()) {
            List<Integer> item = new ArrayList<Integer>();
            List<TreeNode> tmp = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                TreeNode node = list.get(i);
                item.add(node.val);

                if (node.left != null) {
                    tmp.add(node.left);
                }

                if (node.right != null) {
                    tmp.add(node.right);
                }
            }
            list = tmp;
            ret.add(item);
        }
        return ret;
    }


}

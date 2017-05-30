package com.fzy.leetcode.algorithms.problem108;

import java.lang.reflect.Array;

/**
 * Created by fuzeyi on 2017/5/20.
 */
public class CovertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        int middle = nums.length/2;
        TreeNode root = new TreeNode(nums[middle]);
        if(middle!=0){
            int[] leftNms = new int [middle];
            System.arraycopy(nums,0,leftNms,0,middle);
            root.left = sortedArrayToBST(leftNms);
        }else {
            root.left = null;
        }
        if(nums.length-middle-1 !=0) {
            int[] rightNums = new int[nums.length - middle - 1];
            System.arraycopy(nums, middle + 1, rightNums, 0, nums.length - middle - 1);
            root.right = sortedArrayToBST(rightNums);
        }else{
            root.right = null ;
        }
        return root;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        new CovertSortedArrayToBST().sortedArrayToBST(nums);

    }
}

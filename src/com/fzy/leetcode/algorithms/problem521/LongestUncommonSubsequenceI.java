package com.fzy.leetcode.algorithms.problem521;

/**
 * Created by fuzeyi on 2017/5/13.
 */
public class LongestUncommonSubsequenceI {
    public int findLUSlength(String a, String b) {
        String maxStr = "";
        String minStr = "";
        if(a.length() > b.length()){
            maxStr= a;
            minStr = b;
        }else {
            maxStr= b;
            minStr = a;
        }

        for (int i = maxStr.length(); i > 0; i--) {
            for (int j = 0; (j + i < maxStr.length()+1) && j < maxStr.length(); j++) {
                String temp = maxStr.substring(j, j + i);
                if(!minStr.contains(temp)){
                    return temp.length();
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        String a = "aba";
        String b = "cdc";
        System.out.println("result: " + new LongestUncommonSubsequenceI().findLUSlength(a, b));

    }
}

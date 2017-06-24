package com.fzy.leetcode.algorithms.problem345;

/**
 * Created by fuzeyi on 2017/6/22.
 * 英语中的元音字母有 a, e, i, o, u 五个。
 */
public class ReverseVowelsString {
    public String reverseVowels(String s) {
        char[] chs = s.toCharArray();
        int i = 0;
        int j = chs.length - 1;
        while (i <= j) {
            if(isVowels(chs[i]) && isVowels(chs[j])){
                char temp = chs[i];
                chs[i] = chs[j];
                chs[j] = temp;
                i++;
                j--;
            }else if(isVowels(chs[i]) && !isVowels(chs[j])){
                j--;
            }else if(!isVowels(chs[i]) && isVowels(chs[j])){
                i++;
            }else{
                i++;
                j--;
            }
        }
        return new String(chs);
    }

    private boolean isVowels(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println("result: " + new ReverseVowelsString().reverseVowels(s));
    }
}

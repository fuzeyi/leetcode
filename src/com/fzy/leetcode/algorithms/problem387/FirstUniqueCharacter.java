package com.fzy.leetcode.algorithms.problem387;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fuzeyi on 2017/2/26.
 */
public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        char[] chs = s.toCharArray();
        Map<Character, Integer> chsMap = new HashMap<>();
        for (char ch : chs) {
            if (chsMap.get(ch) != null) {
                chsMap.put(ch, chsMap.get(ch) + 1);
            } else {
                chsMap.put(ch, 1);
            }
        }
        for (int i = 0; i < chs.length; i++) {
           if(chsMap.get(chs[i]) == 1){
               return i;
           }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println("index: " + new FirstUniqueCharacter().firstUniqChar(s));
    }
}

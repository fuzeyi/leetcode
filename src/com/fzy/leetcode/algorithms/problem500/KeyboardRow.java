package com.fzy.leetcode.algorithms.problem500;

import java.util.*;

/**
 * Created by fuzeyi on 2017/2/11.
 */
public class KeyboardRow {
    public String[] findWords(String[] words) {
        String aa = "QWERTYUIOP";
        String bb = "ASDFGHJKL";
        String cc = "ZXCVBNM";
        Map<Character, Integer> charIndex = new HashMap<>();
        setIndex(aa, 1, charIndex);
        setIndex(bb, 2, charIndex);
        setIndex(cc, 3, charIndex);
        List<String> ss = new ArrayList<>();
        for (String word : words) {
            if (isValid(word, charIndex)) {
                ss.add(word);
            }

        }
        String[] result = new String[ss.size()];
        return  ss.toArray(result);
        //return result;

    }

    private boolean isValid(String word, Map<Character, Integer> charIndex) {
        char[] chs = word.toUpperCase().toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if ((i + 1) < chs.length && charIndex.get(chs[i]) != charIndex.get(chs[i + 1])) {
                return false;
            }
        }
        return true;
    }

    private void setIndex(String str, int index, Map<Character, Integer> charIndex) {
        for (char c : str.toCharArray()) {
            charIndex.put(c, index);
        }
    }

    public static void main(String[] args) {
        String[] words = {"abdfs", "cccd", "a", "qwwewm"};
        System.out.println("result: " + Arrays.toString(new KeyboardRow().findWords(words)));
    }
}

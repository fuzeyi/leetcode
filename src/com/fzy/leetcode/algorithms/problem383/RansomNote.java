package com.fzy.leetcode.algorithms.problem383;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by fuzeyi on 2017/2/15.
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> rMap = this.getMap(ransomNote);
        Map<Character, Integer> mMap = this.getMap(magazine);
        for (Character c : rMap.keySet()) {
            if (mMap.get(c)== null || rMap.get(c) > mMap.get(c)) {
                return false;
            }
        }
        return true;
    }

    private Map<Character, Integer> getMap(String line) {
        Map<Character, Integer> m = new HashMap<>();
        for (char c : line.toCharArray()) {
            if (null != m.get(c)) {
                m.put(c, m.get(c) + 1);
            } else {
                m.put(c, 1);
            }
        }
        return m;
    }

    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        System.out.println("flag: " + new RansomNote().canConstruct(ransomNote, magazine));
    }
}

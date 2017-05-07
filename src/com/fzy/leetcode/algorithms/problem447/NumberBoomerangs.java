package com.fzy.leetcode.algorithms.problem447;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fuzeyi on 2017/4/4.
 */
public class NumberBoomerangs {
    public int numberOfBoomerangs(int[][] points) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                int d = getDistance(points[i], points[j]);
                map.put(d, map.getOrDefault(d, 0) + 1);
            }

            for (int val : map.values()) {
                count += val * (val - 1);
            }

            map.clear();
        }

        return count;
    }

    private int getDistance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];
        return dx * dx + dy * dy;
    }

    public static void main(String[] args) {
        int[][] points = {{0, 0}, {1, 0}, {2, 0}};
        System.out.println("result: " + new NumberBoomerangs().numberOfBoomerangs(points));
    }
}

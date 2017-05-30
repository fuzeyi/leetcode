package com.fzy.leetcode.algorithms.problem551;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fuzeyi on 2017/5/7.
 */
public class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {

         return !s.matches(".*A.*A.*|.*LLL.*");
    }

    public static void main(String[] args) {
        String s = "PPALLL";
        System.out.println("result: " + new StudentAttendanceRecordI().checkRecord(s));
    }
}

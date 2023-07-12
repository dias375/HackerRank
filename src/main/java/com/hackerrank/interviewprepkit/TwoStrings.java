package com.hackerrank.interviewprepkit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoStrings {

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        char[] one = s1.toCharArray();
        char[] two = s2.toCharArray();
        Arrays.sort(one);
        Arrays.sort(two);
        for(char c : one){
            if(Arrays.binarySearch(two, c)>-1) return "YES";
        }
        return "NO";

    }

}

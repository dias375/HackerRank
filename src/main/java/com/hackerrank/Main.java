package com.hackerrank;

import com.hackerrank.interview.GetTheGroups;

import java.util.ArrayList;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        var run = new GetTheGroups();

        int n = 4;
        List<String> qt = new ArrayList<>();
        qt.add("Friend");
        qt.add("Friend");
        qt.add("Total");

        List<Integer> s1 = new ArrayList<>();
        s1.add(1);
        s1.add(2);
        s1.add(1);

        List<Integer> s2 = new ArrayList<>();
        s2.add(2);
        s2.add(3);
        s2.add(4);

        List<Integer> ans = GetTheGroups.getTheGroups(n, qt, s1, s2);
        for(Integer i : ans) System.out.println(i);






    }
}


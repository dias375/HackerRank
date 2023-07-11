package com.hackerrank;

import com.hackerrank.interviewprepkit.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        int n = 9787;
//        int d = 2895;
//        List<Integer> a = new ArrayList<>();
//        for(int i = 1; i <= n; i++) a.add(i);

        var run = new NewYearChaos();

        var list = new ArrayList<Integer>(Arrays.asList(1, 2, 5, 3, 7, 8, 6, 4));
        //                                      index   1, 2, 3, 4, 5, 6, 7, 8
        //                                      bribe   0, 0, 2,-1, 2, 2,-1,-4



        run.minimumBribes(list);


    }
}


//        List<List<Integer>> arr = new ArrayList<>();
//
//        List<Integer> one = Arrays.asList(-9, -9, -9,  1, 1, 1);
//        List<Integer> two = Arrays.asList( 0, -9,  0,  4, 3, 2);
//        List<Integer> thr = Arrays.asList(-9, -9, -9,  1, 2, 3);
//        List<Integer> fou = Arrays.asList( 0,  0,  8,  6, 6, 0);
//        List<Integer> fiv = Arrays.asList( 0,  0,  0, -2, 0, 0);
//        List<Integer> six = Arrays.asList( 0,  0,  1,  2, 4, 0);
//
//        arr.add(one);
//        arr.add(two);
//        arr.add(thr);
//        arr.add(fou);
//        arr.add(fiv);
//        arr.add(six);

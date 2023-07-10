package com.hackerrank.oneweekinterview;

import java.io.*;
import java.math.*;
import java.security.*;
import java.sql.Array;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long sum = 0;
        for (long i : arr) {
            sum += i;
        }

        Collections.sort(arr);
        long maxSum = sum - arr.get(0);
        long minSum = sum - arr.get(arr.size() - 1);

        System.out.println(minSum + " " + maxSum);
    }
}

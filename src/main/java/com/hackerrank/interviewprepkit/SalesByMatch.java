package com.hackerrank.interviewprepkit;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class SalesByMatch {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        var sockMap = new HashMap<Integer, Integer>();
        for (int sock : ar) sockMap.put(sock, sockMap.getOrDefault(sock, 0)+1);
        int pairs = 0;
        for (int value : sockMap.values()) pairs+=(value/2);
        return pairs;
    }

}

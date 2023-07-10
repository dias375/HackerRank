package com.hackerrank.oneweekinterview;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int sumA = diagonalSum(arr);

        List<List<Integer>> invertedLinesMatrix = invertLinesOrder(arr);

        int sumB = diagonalSum(invertedLinesMatrix);

        int absoluteDifference = Math.abs(sumA - sumB);

        return absoluteDifference;
    }

    private static Integer diagonalSum(List<List<Integer>> arr) {
        int dSum = 0;
        int currentColumn = 0;
        for (List<Integer> currentLine : arr) {
            dSum += currentLine.get(currentColumn);
            currentColumn++;
        }
        return dSum;
    }

    private static List<List<Integer>> invertLinesOrder(List<List<Integer>> arr) {
        List<List<Integer>> invertedLinesMatrix = new ArrayList<>();
        for (List<Integer> currentLine : arr) {
            Collections.reverse(currentLine);
            invertedLinesMatrix.add(currentLine);
        }
        return invertedLinesMatrix;
    }

}

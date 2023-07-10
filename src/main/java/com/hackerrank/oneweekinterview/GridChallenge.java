package com.hackerrank.oneweekinterview;

import java.io.*;
import java.lang.reflect.Array;
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

class GridChallenge {

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
        // Write your code here
        int numberOfCases = Integer.parseInt(grid.get(0));
        StringBuilder answer = new StringBuilder();


        for (int i = 1; i < grid.size(); i++) {
            String inOrder = "YES";
            int matrixSize = Integer.parseInt(grid.get(i));
            List<String> matrix = getMatrix(grid, i + 1, i + matrixSize + 1);
            if (!areColumnsInOrder(matrix)) {
                inOrder = "NO";
            }

            i += matrixSize;
            answer.append(inOrder);
            answer.append("\n");
        }
        return answer.toString();
    }

    private static List<String> getMatrix(List<String> grid, int firstIndex, int lastIndex) {
        List<String> matrix = new ArrayList<>();
        for (int index = firstIndex; index < lastIndex; index++) {
            matrix.add(grid.get(index));
        }
        return matrix;
    }

    private static List<String> sort(List<String> grid) {
        List<String> sortedGrid = new ArrayList<>();

        for (String row : grid) {
            char[] charsInRow = row.toCharArray();
            Arrays.sort(charsInRow);
            sortedGrid.add(new String(charsInRow));
        }

        return sortedGrid;
    }

    private static Boolean areColumnsInOrder(List<String> grid) {
        List<String> transverseGrid = transverse(grid);
        List<String> sortedGrid = sort(transverseGrid);

        for (int index = 0; index < transverseGrid.size(); index++) {
            String transverseString = transverseGrid.get(index);
            String sortedString = sortedGrid.get(index);
            if (!transverseGrid.equals(sortedGrid)) {
                return false;
            }

        }

        return true;
    }

    private static List<String> transverse(List<String> grid) {
        List<String> transverseGrid = new ArrayList<>();

        int i = 0;
        do {
            String buffer = "";
            for (String row : grid) {
                buffer = buffer.concat(String.valueOf(row.charAt(i)));
            }
            transverseGrid.add(buffer);
            i++;
        } while (i < grid.size());
        return transverseGrid;
    }
}
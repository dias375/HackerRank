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

        String negative = "NO";
        String positive = "YES";

        grid = rotate(grid);

        List<String> sortedRotate = sort(grid);

        for(int i = 0 ; i < grid.size() ; i++) {
            if (!Objects.equals(grid.get(i), sortedRotate.get(i))) return negative;
        }
        return positive;

    }

    private static List<String> rotate(List<String> grid){

        List<String> temp = new ArrayList<>();
        int size = grid.get(0).length()-1;

        for (int index  = 0 ; index < size; index++) {
            StringBuilder builder = new StringBuilder();
            for (String s : grid) {
                builder.append(s.charAt(index));
            }
            temp.add(builder.toString());
        }

        return temp;
    }

    private static List<String> sort(List<String> grid){
        int index = 0;
        for(String s : grid){
            char[] array = s.toCharArray();
            Arrays.sort(array);
            grid.set(index, String.valueOf(array));
            index++;
        }
        return grid;
    }
}
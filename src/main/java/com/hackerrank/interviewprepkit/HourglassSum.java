package com.hackerrank.interviewprepkit;

import java.util.List;

public class HourglassSum {
    public int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int maxSum = Integer.MIN_VALUE;

        int lineIndex = 0;
        for(List<Integer> firstLine : arr){
            if(lineIndex+2 == arr.size()) break;
            List<Integer> secondLine = arr.get(lineIndex+1);
            List<Integer> thirdLine = arr.get(lineIndex+2);

            int rowIndex = 0;
            for(int element : firstLine) {
                if(rowIndex+2 == arr.size()) break;
                int left = rowIndex;
                int center = rowIndex + 1;
                int right = rowIndex + 2;

                int firstLineSum = firstLine.get(left) + firstLine.get(center) + firstLine.get(right);
                int secondLineSum = secondLine.get(center);
                int thirdLineSum = thirdLine.get(left) + thirdLine.get(center) + thirdLine.get(right);
                int sum = firstLineSum + secondLineSum + thirdLineSum;

                if (sum > maxSum) maxSum = sum;
                rowIndex++;
            }
            lineIndex++;
        }
        return maxSum;
    }
}

/*
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
 */

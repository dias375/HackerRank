package com.hackerrank.interviewprepkit;

public class CountingValleys {
    public int countingValleys(int steps, String path) {
        // Write your code here
        int level = 0;
        boolean onValley = false;
        int valleyCount = 0;
        char[] pathArray = path.toCharArray();

        for(char c : pathArray){
            if(c == 'U') level++;
            if(c == 'D') level--;

            if(level < 0 && !onValley) {
                onValley = true;
                valleyCount++;
                continue;
            }
            if(level >= 0 && onValley) {
                onValley = false;
            }
        }
        return valleyCount;
    }
}

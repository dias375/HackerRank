package com.hackerrank.interviewprepkit;

import java.util.List;

public class JumpingOnClouds {
    public int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int jump = 0;
        int index = 0;
        for(int value : c){
            if(index+2 < c.size() && c.get(index+2) == 0){
                jump++;
                index+=2;
                continue;
            }
            if(index+1 < c.size() && c.get(index+1) == 0){
                jump++;
                index++;
            }
        }
        return jump;
    }
}

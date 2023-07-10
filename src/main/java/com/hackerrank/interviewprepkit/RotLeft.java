package com.hackerrank.interviewprepkit;

import java.util.ArrayList;
import java.util.List;

public class RotLeft {
    public List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        int rotations = a.size() % d == 0 ? d : a.size() % d;

        List<Integer> rotatedList = new ArrayList<>(a);

        int numIndex = 0;
        for(int num : a){
            int rotatedIndex = (numIndex+rotations) % a.size();
            rotatedList.set(rotatedIndex, num);
            numIndex++;
        }
        return rotatedList;
    }
}

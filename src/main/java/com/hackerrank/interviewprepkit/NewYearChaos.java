package com.hackerrank.interviewprepkit;

import java.util.List;

public class NewYearChaos {

    public void minimumBribes(List<Integer> q) {
        // Write your code here
        int bribeSwap = 0;
        int index = 0;
        for(int person : q){
            index++;
            int bribe = person-index;
            if(bribe == 0 || bribe == -1 || bribe == -2) continue;
            if(bribe>2) {
                System.out.println("Too chaotic");
                return;
            }
            if(bribe>0) bribeSwap += bribe;
            if(bribe<0) bribeSwap++;
        }

        System.out.println(bribeSwap);

    }
}
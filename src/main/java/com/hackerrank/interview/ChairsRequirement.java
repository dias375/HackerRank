package com.hackerrank.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChairsRequirement {

    public static List<Integer> minChairs(List<String> simulations) {
        List<Integer> chairList = new ArrayList<>();
        for(String s : simulations){
            chairList.add(localSim(s));
        }
        return chairList;

    }

    public static Integer localSim(String sim){
        char[] array = sim.toCharArray();

        int chairs = 0;
        int available = 0;
        for(char c : array){

            switch(c){
                case 'C':
                case 'U':
                    if(available == 0) chairs++;
                    else available--;
                    break;
                case 'R':
                case 'L':
                    available++;
                    break;
            }
        }
        return chairs;
    }
}

package com.hackerrank.interviewprepkit;

import java.util.List;

public class RansomNote {

    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here

        for(String word : note){
            if(magazine.contains(word)) magazine.remove(word);
            else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}

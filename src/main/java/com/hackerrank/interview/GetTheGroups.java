package com.hackerrank.interview;

import java.util.ArrayList;
import java.util.List;

public class GetTheGroups {

    public static List<Integer> getTheGroups(int n, List<String> queryType, List<Integer> students1, List<Integer> students2) {



        List<List<Integer>> groups = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        List<Integer> studentsThatArrived = new ArrayList<>();
        List<Integer> studentsWithFriends = new ArrayList<>();

        int index = 0;
        for(String s : queryType) {
            int student1 = students1.get(index);
            int student2 = students2.get(index);
            if(!studentsThatArrived.contains(student1)) studentsThatArrived.add(student1);
            if(!studentsThatArrived.contains(student2)) studentsThatArrived.add(student2);
            switch (s) {
                case "Friend":
                    boolean found = false;
                    for(List<Integer> group : groups){
                        if(group.contains(student1)){
                            group.add(student2);
                            studentsWithFriends.add(student2);
                        } else if(group.contains(student2)){
                            group.add(student1);
                            studentsWithFriends.add(student1);
                        }
                    }
                    if(!found){
                        List<Integer> newGroup = new ArrayList<>();
                        newGroup.add(student1);
                        newGroup.add(student2);
                        studentsWithFriends.addAll(newGroup);
                        groups.add(newGroup);
                        System.out.println("new group added");
                    }
                    index++;
                    break;
                case "Total":
                    int sum = 0;
                    sum = studentsThatArrived.size() - studentsWithFriends.size();
                    for(List<Integer> group : groups) sum+= group.size();
                    ans.add(sum);
            }
        }

        return ans;
    }

}
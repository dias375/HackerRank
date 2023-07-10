package com.hackerrank.interviewprepkit;

public class RepeatedString {
    public long repeatedString(String s, long n) {
        // Write your code here
        char[] charArray = s.toCharArray();
        long fullStrings = n / charArray.length;
        long brokeStringCharCount = n % charArray.length;

        long fullCount = 0;
        long brokeCount = 0;
        long brokenChars = 0;
        for(char c : charArray) {
            if(c == 'a') fullCount++;
            if(brokenChars == brokeStringCharCount) continue;
            if(c == 'a') brokeCount++;
            brokenChars++;
        }

        return (fullCount * fullStrings)+brokeCount;
    }
}

/*
        char[] charArray = s.toCharArray();
        int arrayIndex = 0;
        for(int i = 0 ; i <= n ; i++){
            if(arrayIndex == charArray.length) arrayIndex = 0;
            if(charArray[arrayIndex] == 'a') count++;
            arrayIndex++;
        }
*/


/*
    long count = 0;
    char[] charArray = s.toCharArray();
    long fullStrings = n / charArray.length;
    long brokeStringCharCount = n % charArray.length;

        for(char c : charArray) {
                if(c == 'a') count++;
                }

                count = count * fullStrings;

                int brokenChars = 0;
                for(char c : charArray){
                if(brokenChars == brokeStringCharCount) break;
                if(c == 'a') count++;
                brokenChars++;
                }

                return count;
 */
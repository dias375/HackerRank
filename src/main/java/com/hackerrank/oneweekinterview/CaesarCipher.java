package com.hackerrank.oneweekinterview;


import java.util.*;
import static java.util.stream.Collectors.joining;

class CaesarCipher {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {

        List<Character> ret = new ArrayList<>();
        k=k%26; // 1

        for (Character c : s.toCharArray()) {
            if(c.toString().matches("^[a-zA-Z]*$")){ //2
                char temp = (char)((int)(c)+k);

                if ((c>='A' && c<='Z' && temp>'Z')||(temp>'z'))  temp-=26; //3

                c = temp;
            }
            ret.add(c);
        }
        return ret.stream().map(n-> String.valueOf(n)).collect(joining());
    }

}
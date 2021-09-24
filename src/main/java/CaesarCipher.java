import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

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
        // Write your code here

        StringBuilder output = new StringBuilder("");


        for (char letter : s.toCharArray()) {
            if (letter > 64 && letter < 91)//Capital letter
            {
                char encrypted = (char) (letter + k);
                if (encrypted > 90) {
                    encrypted = (char) ((encrypted % 90) + 64);
                }
                output.append(encrypted);
            } else if (letter > 96 && letter < 123)//Lower case letter
            {
                char encrypted = (char) (letter + k);
                if (encrypted > 122) {
                    encrypted = (char) ((encrypted % 122) + 96);
                }
                output.append(encrypted);
            } else//Symbol
            {
                output.append(letter);
            }

        }

        return output.toString();

    }

    private static int charIndex(int number) {
        if (number > 0 && number < 27) {
            return number - 1;
        }

        if (number > 27) {
            do {
                number -= 27;
            } while (number > 27);
            return number - 1;
        }

        return 0;
    }

    private static String alphabet(int index) {
        List<String> dictionary = new ArrayList<>();
        dictionary.add("a");
        dictionary.add("b");
        dictionary.add("c");
        dictionary.add("d");
        dictionary.add("e");
        dictionary.add("f");
        dictionary.add("g");
        dictionary.add("h");
        dictionary.add("i");
        dictionary.add("j");
        dictionary.add("k");
        dictionary.add("l");
        dictionary.add("m");
        dictionary.add("n");
        dictionary.add("o");
        dictionary.add("p");
        dictionary.add("q");
        dictionary.add("r");
        dictionary.add("s");
        dictionary.add("t");
        dictionary.add("u");
        dictionary.add("v");
        dictionary.add("w");
        dictionary.add("x");
        dictionary.add("y");
        dictionary.add("z");

        return dictionary.get(index);
    }

}
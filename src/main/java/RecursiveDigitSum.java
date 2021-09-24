import java.io.*;
import java.lang.reflect.Array;
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

class RecursiveDigitSum {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {
        // Write your code here
        long superDigit = digitsSum(n) * k;
        do {
            superDigit = digitsSum(superDigit);
        } while (superDigit > 9);
        return (int) superDigit;
    }

    private static long digitsSum(long number) {
        long sum = 0;
        String numberString = String.valueOf(number);
        char[] charArray = numberString.toCharArray();
        for (char c : charArray) {
            sum += Long.parseLong(String.valueOf(c));
        }
        return sum;
    }

    private static long digitsSum(String numberString) {
        long sum = 0;
        char[] charArray = numberString.toCharArray();
        for (char c : charArray) {
            sum += Long.parseLong(String.valueOf(c));
        }
        return sum;
    }

}

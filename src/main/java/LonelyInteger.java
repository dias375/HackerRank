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

public class LonelyInteger {

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int lonely = 0;
        List<Integer> b = new ArrayList<>();

        for (int i : a) {
            int occurrences = Collections.frequency(a, i);
            if (occurrences == 1) {
                lonely = i;
                break;
            }

        }

        return lonely;
    }

}

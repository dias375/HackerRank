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

class PlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int arraySize = arr.size();

        int positivesInArray = 0;
        int negativesInArray = 0;
        int zerosInArray = 0;
        for (int i : arr) {
            if (i == 0) {
                zerosInArray++;
            } else if (i > 0) {
                positivesInArray++;
            } else {
                negativesInArray++;
            }
        }

        double positiveRatio = positivesInArray / (arraySize * 1.0);
        double zerosRatio = zerosInArray / (arraySize * 1.0);
        double negativeRatio = negativesInArray / (arraySize * 1.0);

        DecimalFormat sixDecimalsFormat = new DecimalFormat("###0.000000");
        System.out.println(sixDecimalsFormat.format(positiveRatio));
        System.out.println(sixDecimalsFormat.format(negativeRatio));
        System.out.println(sixDecimalsFormat.format(zerosRatio));
    }

}

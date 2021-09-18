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

public class CountingSortOne {

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> frequencyArray = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int frequency = Collections.frequency(arr, i);
            frequencyArray.add(frequency);
        }
        return frequencyArray;
    }
}

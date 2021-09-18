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

public class MockFindMedian {

    public static int findMedian(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int sizeOfArray = arr.size();
        int medianPoint = sizeOfArray / 2;
        return (arr.get(medianPoint));
    }


}

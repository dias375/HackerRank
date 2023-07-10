package com.hackerrank.oneweekinterview;

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

public class TimeConvertion {

    public static String timeConversion(String s) {
        // Write your code here
        int hoursStd = Integer.parseInt(s.substring(0, 2));
        int minutesStd = Integer.parseInt(s.substring(3, 5));
        int secondsStd = Integer.parseInt(s.substring(6, 8));
        String periodStd = s.substring(8, 10);

        int hoursMil = hoursStd;
        if (periodStd.equals("PM") && hoursStd != 12) {
            hoursMil += 12;
        } else if (hoursStd == 12) {
            hoursMil = 0;
        }

        DecimalFormat twoIntegersFormat = new DecimalFormat("###00");
        String formatedHours = twoIntegersFormat.format(hoursMil);
        String formatedMinutes = twoIntegersFormat.format(minutesStd);
        String formatedSeconds = twoIntegersFormat.format(secondsStd);
        String formatedTime = formatedHours + ":" + formatedMinutes + ":" + formatedSeconds;

        return formatedTime;
    }
}

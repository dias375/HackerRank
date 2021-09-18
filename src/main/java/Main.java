import java.util.*;

import static java.util.stream.Collectors.joining;

public class Main {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);

        List<List<Integer>> b = new ArrayList<>();

        b.add(a);
        b.add(a);
        b.add(a);

        System.out.println(DiagonalDifference.diagonalDifference(b));


    }
}

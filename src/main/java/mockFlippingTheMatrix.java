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


public class mockFlippingTheMatrix {

    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here

        int flippedMatrixQuadrantSum = 0;
        int matrixQuadrantSum = 0;
        List<List<Integer>> flippedMatrix = new ArrayList<>();

        do {
            Collections.copy(matrix, flippedMatrix);

            flippedMatrix = flipLines(flippedMatrix);
            flippedMatrix = flipColumns(flippedMatrix);

            flippedMatrixQuadrantSum = quadrantSum(flippedMatrix);
            matrixQuadrantSum = quadrantSum(matrix);

            if (flippedMatrixQuadrantSum > matrixQuadrantSum) {
                Collections.copy(flippedMatrix, matrix);
            } else {
                break;
            }
        } while (true);


        return 0;

    }

    private static Integer quadrantSum(List<List<Integer>> matrix) {

        return 0;
    }

    private static List<List<Integer>> getQuadrant(List<List<Integer>> matrix) {
        List<List<Integer>> halfLines = halfLines(matrix);

        List<List<Integer>> quadrant = halfColumns(halfLines);
        return null;
    }

    private static List<Integer> halfList(List<Integer> list) {
        int halfListSize = list.size() / 2;
        List<Integer> halfList = new ArrayList<>();
        for (int index = 0; index < halfListSize; index++) {
            halfList.add(list.get(index));
        }
        return halfList;
    }

    private static List<List<Integer>> halfColumns(List<List<Integer>> list) {
        List<List<Integer>> halfColumns = new ArrayList<>();
        
        return halfColumns;
    }

    private static List<List<Integer>> halfLines(List<List<Integer>> list) {
        int halfListSize = list.size() / 2;
        List<List<Integer>> halfLines = new ArrayList<>();
        for (int index = 0; index < halfListSize; index++) {
            halfLines.add(list.get(index));
        }
        return halfLines;
    }

    private static List<List<Integer>> flipLines(List<List<Integer>> matrix) {
        return null;
    }

    private static List<List<Integer>> flipColumns(List<List<Integer>> matrix) {
        return null;
    }

    private static Boolean isTheReversedSumBigger(List<Integer> list) {
        int listSum = listSum(list);

        Collections.reverse(list);
        int reversedListSum = listSum(list);

        return reversedListSum > listSum;
    }

    private static List<List<Integer>> reverseLineByIndex(List<List<Integer>> matrix, int lineIndex) {
        List<Integer> line = matrix.get(lineIndex);

        Collections.reverse(line);

        matrix.set(lineIndex, line);
        return matrix;
    }

    private static List<List<Integer>> reverseColumnByIndex(List<List<Integer>> matrix, int columnIndex) {
        List<Integer> column = getColumn(matrix, columnIndex);

        Collections.reverse(column);

        List<List<Integer>> newMatrix = new ArrayList<>();
        newMatrix = setColumn(matrix, column, columnIndex);

        return newMatrix;
    }

    private static Integer listSum(List<Integer> originalLine) {
        int sum = 0;
        for (int element : originalLine) {
            sum += element;
        }
        return sum;
    }

    private static List<Integer> getColumn(List<List<Integer>> originalMatrix, int columnIndex) {
        List<Integer> originalColumn = new ArrayList<>();

        for (List<Integer> matrixLine : originalMatrix) {
            int element = matrixLine.get(columnIndex);
            originalColumn.add(element);
        }
        return originalColumn;
    }

    private static List<List<Integer>> setColumn(List<List<Integer>> matrix, List<Integer> newColumn, int columnIndex) {
        int i = 0;
        for (List<Integer> matrixLine : matrix) {
            int element = matrixLine.set(columnIndex, newColumn.get(i));
            i++;
        }
        return matrix;
    }

}

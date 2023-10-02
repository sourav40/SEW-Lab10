package org.example.questionTwo;

public class ArrayFlattenerService {

    public static int[] flattenArray(int[][] inputArray) {
        if (inputArray == null) {
            return new int[0];
        }

        int totalValue = 0;

        for (int[] val : inputArray) {
            totalValue += val.length;
        }

        int[] outputArray = new int[totalValue];
        int index = 0;
        for (int[] val : inputArray) {
            for (int number : val) {
                outputArray[index++] = number;
            }
        }
        return outputArray;
    }
}

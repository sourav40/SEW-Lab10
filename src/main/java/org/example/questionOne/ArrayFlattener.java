package org.example.questionOne;

public class ArrayFlattener {

    public static void main(String[] args) {
        int[][] inputOne = {{1, 3}, {0}, {4, 5, 9}};
        System.out.println(flattenArray(inputOne));
    }

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

package org.example.questionTwo;


public class ArrayReversor {

    public static int[] reverseArray(int[][] inputArray) {
        int[] singleArrayList = ArrayFlattenerService.flattenArray(inputArray);
        if (singleArrayList.length == 0) {
            return singleArrayList;
        }

        int leftIndex = 0;
        int rightIndex = singleArrayList.length - 1;

        while (leftIndex < rightIndex) {
            int temp = singleArrayList[leftIndex];
            singleArrayList[leftIndex] = singleArrayList[rightIndex];
            singleArrayList[rightIndex] = temp;

            leftIndex++;
            rightIndex--;
        }
        return singleArrayList;
    }
}

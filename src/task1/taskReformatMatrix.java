package task1;

import java.util.Arrays;

public class taskReformatMatrix {
    public static void main(String[] args) {
        int[][] z = new int[][]{{100, 2, 3, 4, 10}, {400, 5, 6, 17}, {70, 8000, 9},};
        System.out.println(Arrays.deepToString(reformatMatrix(z)));
    }

    public static int[][] reformatMatrix(int[][] array) {
        int[] arrayOfMaxElements = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int maxElement = array[i][0];
            for (int j = 0; j < array[i].length; j++) {
                if (maxElement < array[i][j]) {
                    maxElement = array[i][j];
                }
            }
            arrayOfMaxElements[i] = maxElement;
        }
        int minElements = arrayOfMaxElements[0];
        int index = 0;
        for (int i = 0; i < arrayOfMaxElements.length; i++) {
            if (minElements > arrayOfMaxElements[i]) {
                index = i;
                minElements = arrayOfMaxElements[i];
            }
        }
        int[][] tempMatrix = new int[array.length - 1][array[0].length];
        for (int i = 0; i < tempMatrix.length; i++) {
            if (i < index) {
                tempMatrix[i] = array[i];
            }
            if (i >= index) {
                tempMatrix[i] = array[i + 1];
            }
        }
        array = tempMatrix;
        return array;
    }
}

package task1;

import java.util.Arrays;

public class taskFillMatrix {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(fillingMatrix(15, 3)));
    }

    public static int[][] fillingMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        int count;
        for (int i = 1; i < rows; i++) {
            count = 0;
            for (int j = columns - 1; j > 0 && count != i; j--) {
                matrix[i][j] = 1;
                ++count;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i >= columns) {
                    matrix[i][j] = 1;
                }
                if (i >= columns && j == columns - 1) {
                    matrix[i][j] = i - j;
                }
            }
        }
        return matrix;
    }
}

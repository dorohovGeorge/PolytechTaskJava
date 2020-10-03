package task1;

import java.util.Arrays;

public class taskShellSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shellSort(args)));
    }

    public static int[] shellSort(String[] args) {
        int[] array = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        int length = array.length;
        for (int gap = length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < length; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
        return array;
    }
}

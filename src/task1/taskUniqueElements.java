package task1;

import java.util.Arrays;
import java.util.HashSet;

public class taskUniqueElements {
    public static void main(String[] args) {
        System.out.println(countOfUniqueElementsShortImpl(args));
    }

    public static int countOfUniqueElements(String[] args) {
        int[] array = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int value : array) {
            hashSet.add(value);
        }
        return hashSet.size();
    }

    public static int countOfUniqueElementsShortImpl(String[] args) {
        return (int) Arrays.stream(args).mapToInt(Integer::parseInt).distinct().count();
    }
}

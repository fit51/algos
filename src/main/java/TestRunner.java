import algo.Algorithm;

import java.util.Arrays;

public class TestRunner {
    public static void main(String[] args) {
        int[] ex = new int[] {1 ,34 ,4, 1, 34, 45, 65, 2, 5, 7, 7, 4, 567, 2 };

        Algorithm.QuickSort.quickSort(ex, 0, ex.length - 1);
        System.out.println(Arrays.toString(ex));


    }
}


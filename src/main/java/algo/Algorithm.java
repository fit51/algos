package algo;

public class Algorithm {

    public static class QuickSort {

        public static void quickSort(int[] a, int lo, int hi) {
            if(lo < hi) {
                int p = partition(a, lo, hi);
                quickSort(a, lo, p - 1);
                quickSort(a, p, hi);
            }
            return;
        }

        public static int partition(int[] a, int lo, int hi) {
            int pivot = getPivot(a, lo, hi);
            int i = lo;
            int j = hi;
            while (i < j) {
                while(i <= j && a[i] < pivot) {
                    i++;
                }
                while(j >= i && a[j] > pivot) {
                    j--;
                }
                if(i <= j) {
                    swap(a, i, j);
                    i++;
                    j--;
                }
            }
            return i;
        }

        public static int getPivot(int[] a, int lo, int hi) {
            return a[lo];
        }

        public static void swap(int[] a, int i, int j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            return;
        }
    }
}

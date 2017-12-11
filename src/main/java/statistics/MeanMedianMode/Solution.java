package statistics.MeanMedianMode;
import algo.Algorithm;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Algorithm.QuickSort.quickSort(arr, 0, arr.length - 1);

        long sum = 0;
        for(int v: arr) {
//            System.out.print(v + " ");
           sum += v;
        }

        //mean
        double mean = (double)sum/n;

        //median
        double median = 0;
        if(n % 2 == 0) {
            median = (double)(arr[n/2] + arr[n/2 - 1])/2;
        } else median = arr[n/2];

        //mode
        int[] count = new int[100001];

        for(int v: arr) {
            count[v]++;
        }
        int maxOccurs = 0;
        int mode = 0;
        for(int i=0; i < count.length; i++) {
            if(count[i] > maxOccurs) {
                maxOccurs = count[i];
                mode = i;
            } else
                if(count[i] == maxOccurs && mode > i)
                    mode = i;
        }

        System.out.println((double) Math.round(mean * 10)/10);
        System.out.println((double) Math.round(median * 10)/10);
        System.out.println(mode);
    }
}

package forces.C;

import java.util.*;

/**
 * Created by Gamer on 26.12.2017.
 * http://codeforces.com/problemset/problem/910/C
 */
public class MinimalSum {
    public static void main(String[] args) {
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        HashSet<Character> canBeZero = new HashSet(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'));
        HashSet<Character> posChars = new HashSet(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'));
        for(Character c:  posChars) {
            m.put(c, 0);
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.next();
        }
        for(int i = 0; i<n; i++) {
            char[] st = arr[i].toCharArray();
            canBeZero.remove(st[0]);
            for(int j = 0; j < st.length; j++) {
                Integer val = m.getOrDefault(st[j], 0);
                int pos = st.length - j - 1;
                m.put(st[j], val + (int) Math.pow(10, pos));
            }
        }
        List<Map.Entry<Character, Integer>> entries = new ArrayList(m.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return -1 * o1.getValue().compareTo(o2.getValue());
            }
        });

        long minSum = 0;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int pos = 0;
        boolean zeroUsed = false;
        for(Map.Entry<Character, Integer> entry: entries) {
            if(canBeZero.contains(entry.getKey()) && !zeroUsed) {
                zeroUsed = true;
            }
            else {
                int v = entry.getValue();
                if (v > 0) {
                    minSum += numbers[pos] * v;
                    pos++;
                }
            }
        }
        System.out.println(minSum);
    }
}

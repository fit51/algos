package forces.C;

import java.util.*;

/**
 * Created by Gamer on 26.12.2017.
 * http://codeforces.com/problemset/problem/910/C
 */
public class MinimalSum {
    public static void main(String[] args) {
        Map m = new HashMap<Character, Integer>();
        HashSet posChars = new HashSet<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'));
        Map mm = new HashMap<Integer, HashSet<Character>>();


        Map<Integer, Map<Character, Integer>> posToChar = new HashMap<Integer, Map<Character, Integer>>();
        for(int i = 1; i <= 6; i++) {
            posToChar.put(i, new ArrayList<Character>());
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i<n; i++) {
            char[] ar = sc.nextLine().toCharArray();
            for(int j = 0; j< ar.length; j++) {
                 posToChar.get(ar.length - j).add(ar[j]);
            }
        }
        int min = 0;
        for(int i = 6; i >= 1; i--) {
            Map<Character, Integer> count = new HashMap<Character, Integer>();
            for(Character c: posToChar.get(i)) {
                count.put(c, count.getOrDefault(c, 0) + 1);
            }
        }

    }
}

package forces.A;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Gamer on 05.01.2018.
 */
public class NewYNumOfCards {

    public static void main(String[] args) {

        HashSet<Character> symbols1 =  new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        HashSet<Character> symbols2 =  new HashSet(Arrays.asList('1', '3', '5', '7', '9'));
        Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();
        int num = 0;
        for(int i = 0; i < str.length; i++) {
            if(symbols1.contains(str[i]) || symbols2.contains(str[i]))
                num ++;
        }
        System.out.println(num);
    }
}

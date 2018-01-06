//package forces.C;
import java.util.Scanner;

/**
 * Created by Gamer on 06.01.2018.
 */
public class NewYKerling {

    public class Circle {
        public Circle(int x, double y) {
            this.x = x;
            this.y = y;
        }
        int x;
        double y;
    }

    public boolean inters(int x1, int x2, int r) {
        return Math.abs(x1 - x2) <= 2*r;
    }

    public double catheter(int x1, int x2, int r) {
        return Math.sqrt(4*r*r - (x1 - x2)*(x1 - x2));
    }

    public static void main(String[] args) {

//        System.out.println(2 + new NewYKerling().catheter(43, 42, 2));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int[] start = new int[n];
        Circle[] circles = new Circle[n];

        for(int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
        }
        NewYKerling inst = new NewYKerling();
        circles[0] = inst.new Circle(start[0], r);
        for(int i = 1; i < n; i++) {
            Circle meets = null;
            for(int j = i-1; j >= 0; j--) {
                if (inst.inters(start[i], circles[j].x, r))
                    if (meets == null || (meets != null &&
                            (meets.y < circles[j].y ||
                                    (meets.y == circles[j].y && Math.abs(circles[j].x - start[i]) <  Math.abs(meets.x - start[i])))))
                        meets = circles[j];
            }
            if (meets == null)
                circles[i] = inst.new Circle(start[i], r);
            else
                circles[i] = inst.new Circle(start[i], meets.y + inst.catheter(start[i], meets.x, r));
        }

        for(int i = 0; i < n; i++) {
            System.out.print(circles[i].y + " ");
        }
    }
}

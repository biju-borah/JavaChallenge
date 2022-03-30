import java.util.*;

public class LoopTwo {
    public static void main(String[] args) {
        int query;
        Scanner sc = new Scanner(System.in);
        query = Integer.parseInt(sc.nextLine());
        while (query > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int s = 0;
            for (int i = 1; i <= n; i++) {
                s += a;
                for (int j = 1; j <= i; j++) {
                    s += Math.pow(2, j - 1) * b;
                }
                System.out.print(s);
                System.out.print(" ");
                s = 0;
            }
            System.out.println();
            query--;
        }

        sc.close();
    }
}

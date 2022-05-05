import java.util.ArrayList;
import java.util.Scanner;

public class problemA {
    public static boolean isprime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        int count = 0;
        for (int x = 0; x < n; x++) {
            k++;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (isprime(i) && isprime(j)) {
                        if (i * j == k && i != j) {
                            count++;
                        } else {
                            int flag = 0;
                            int y = k;
                            for (int z = 0; z < k; z++) {
                                if (i < y) {
                                    y /= i;
                                } else {
                                    if (y / j == 0) {
                                        flag = 1;
                                        count++;
                                    }
                                }
                            }
                            if (flag == 0) {
                                y = k;
                                for (int z = 0; z < k; z++) {
                                    if (j < y) {
                                        y /= j;
                                    } else {
                                        if (y / i == 0) {
                                            count++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }
        System.out.println(count / 2);

        sc.close();
    }
}
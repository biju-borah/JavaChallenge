import java.util.Scanner;

public class TwoDArrayDS {
    public static int hourglassSum(String[][] list) {
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            if (i > 3) {
                // System.out.println(i);
                break;
            }
            int tempSum = 0;
            for (int j = 0; j < 6; j++) {
                if (j > 3) {
                    // System.out.println(j);
                    continue;
                }
                tempSum = Integer.parseInt(list[i][j]) + Integer.parseInt(list[i][j + 1])
                        + Integer.parseInt(list[i][j + 2]) + Integer.parseInt(list[i + 1][j + 1])
                        + Integer.parseInt(list[i + 2][j]) + Integer.parseInt(list[i + 2][j + 1])
                        + Integer.parseInt(list[i + 2][j + 2]);
                if (i == 0 && j == 0) {
                    sum = tempSum;
                }
                if (sum < tempSum) {
                    sum = tempSum;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] list = new String[6][6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            list[i] = sc.nextLine().split(" ");
        }

        System.out.println(hourglassSum(list));
        sc.close();

    }
}

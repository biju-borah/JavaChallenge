import java.util.Scanner;

public class ArrayDS {

    public static String[] reverseArray(String[] list) {
        int len = list.length;
        for (int i = 0; i < len / 2; i++) {
            String temp = list[i];
            list[i] = list[len - i - 1];
            list[len - i - 1] = temp;
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list = scanner.nextLine().split(" ");

        String[] res = reverseArray(list);
        for (String string : res) {
            System.out.print(string);
            System.out.print(" ");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Eof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (sc.hasNextLine()) {
            System.out.print(i);
            System.out.print(" ");
            System.out.print(sc.nextLine());
            System.out.println();
            i++;

        }
        sc.close();
    }
}

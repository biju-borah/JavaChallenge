import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Datatype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n > 0) {
            ArrayList<String> datatype = new ArrayList<>();
            BigInteger reallyBig = new BigInteger(sc.nextLine());
            if (reallyBig.bitLength() > 64) {
                System.out.print(reallyBig);
                System.out.print(" can't be fitted anywhere.\n");
                n--;
                continue;
            }
            if (reallyBig.bitLength() < 8) {
                datatype.add("* byte");
            }
            if (reallyBig.bitLength() < 16) {
                datatype.add("* short");
            }
            if (reallyBig.bitLength() < 32) {
                datatype.add("* int");
            }
            if (reallyBig.bitLength() < 64) {
                datatype.add("* long");
            }
            if (datatype.isEmpty()) {
                System.out.print(reallyBig);
                System.out.print(" can't be fitted anywhere.\n");
                n--;
                continue;
            }
            System.out.print(reallyBig);
            System.out.print(" can be fitted in:\n");
            for (String string : datatype) {
                System.out.println(string);
            }
            n--;
        }
        sc.close();
    }
}

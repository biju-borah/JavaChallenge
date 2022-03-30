import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     * 1. INTEGER n
     * 2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        int commandLen = queries.size();
        int lastAnswer = 0;
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }
        for (int i = 0; i < commandLen; i++) {
            int idx = ((queries.get(i).get(1) ^ lastAnswer) % n);
            if (queries.get(i).get(0) == 1) {
                arr.get(idx).add(queries.get(i).get(2));
            } else {
                lastAnswer = arr.get(idx).get(queries.get(i).get(2) % (arr.get(idx).size()));
                System.out.println(lastAnswer);
            }
        }
        return null;

    }

}

public class DynamicArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        Result.dynamicArray(n, queries);

        bufferedReader.close();
    }
}
// 100 15
// 1 345255357 205970905
// 1 570256166 75865401
// 1 94777800 645102173
// 1 227496730 16649450
// 1 82987157 486734305
// 1 917920354 757848208
// 1 61379773 817694251
// 1 330547128 112869154
// 1 328743001 855677723
// 1 407951306 669798718
// 1 21506172 676980108
// 1 49911390 342109400
// 1 980306253 305632965
// 2 736380701 402184046
// 2 798108301 416334323
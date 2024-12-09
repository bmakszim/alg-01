package greedy;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Candies {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, n).mapToObj(_ -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .toList();

        long result = candies(n, arr);

        System.out.println(result);
    }

    public static long candies(int n, List<Integer> arr) {
        return 0;
    }
}

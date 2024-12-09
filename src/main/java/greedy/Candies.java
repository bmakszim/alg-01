package greedy;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Candies {
    public static void main(String[] args) throws IOException {
        var arr = ReadInput();
        long result = solve(arr.size(), arr);

        System.out.println(result);
    }

    public static long solve(int n, List<Integer> arr) {
        long[] candies = new long[n];
        Arrays.fill(candies, 1); // Give each child at least one candy

        // Forward pass: ensure each child has more candies than the previous one if their rating is higher
        for (int i = 1; i < n; i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Backward pass: ensure each child has more candies than the next one if their rating is higher
        for (int i = n - 2; i >= 0; i--) {
            if (arr.get(i) > arr.get(i + 1)) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Calculate the total candies
        long totalCandies = 0;
        for (long candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }

    private static List<Integer> ReadInput() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        return IntStream.range(0, n).mapToObj(_ -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .toList();
    }
}

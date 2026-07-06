package Contest_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
*
* Not solved in contest.
*
* */
public class C2 {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
    }

    public static void main(String[] args) {
        FastReader s = new FastReader();
        int testCases = s.nextInt();

        while (testCases-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = s.nextInt();
            }

            long[] preAbs = new long[n];
            preAbs[0] = Math.abs(arr[0]);
            for (int j = 1; j < n; j++) {
                preAbs[j] = preAbs[j-1] + Math.abs(arr[j]);
            }

            long[] suf = new long[n + 1];
            suf[n - 1] = arr[n - 1];
            for (int j = n - 2; j >= 0; j--) {
                suf[j] = suf[j + 1] + arr[j];
            }

            long maxSum = suf[0];
            int bestIdx = -1;

            for (int i = 1; i < n; i++) {
                if (arr[i] > 0) {
                    long currentScore = preAbs[i - 1] - arr[i] + suf[i + 1];

                    if (currentScore > maxSum) {
                        maxSum = currentScore;
                        bestIdx = i;
                    }
                }
            }

            if (bestIdx == -1) {
                System.out.println(0);
                System.out.println();
                continue;
            }

            ArrayList<Integer> operations = new ArrayList<>();
            int flipCount = 0;
            for (int j = bestIdx - 1; j >= 0; j--) {
                if (flipCount % 2 != 0) {
                    arr[j] = -arr[j];
                }
                if (arr[j] > 0) {
                    operations.add(j);
                    flipCount++;
                }
            }

            operations.add(bestIdx);
            System.out.println(operations.size());
            for (Integer operation : operations) {
                System.out.print((operation + 1) + " ");
            }
            System.out.println();
        }
    }
}
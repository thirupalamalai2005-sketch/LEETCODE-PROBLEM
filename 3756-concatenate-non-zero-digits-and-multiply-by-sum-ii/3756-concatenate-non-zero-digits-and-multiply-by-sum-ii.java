class Solution {
    public static int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();
        long mod = 1000000007L;

        int[] prefixSum = new int[n + 1];
        int[] nonZeroCount = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';
            prefixSum[i + 1] = prefixSum[i] + digit;
            nonZeroCount[i + 1] = nonZeroCount[i] + (digit != 0 ? 1 : 0);
        }

        int totalNonZeros = nonZeroCount[n];
        long[] hash = new long[totalNonZeros + 1];
        long[] power10 = new long[totalNonZeros + 1];
        power10[0] = 1;

        int idx = 1;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c != '0') {
                int digit = c - '0';
                hash[idx] = (hash[idx - 1] * 10 + digit) % mod;
                power10[idx] = (power10[idx - 1] * 10) % mod;
                idx++;
            }
        }

        int[] arr = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int qStart = queries[i][0];
            int qEnd = queries[i][1];

            long currentSum = prefixSum[qEnd + 1] - prefixSum[qStart];
            int nzStart = nonZeroCount[qStart];
            int nzEnd = nonZeroCount[qEnd + 1];

            long currentMul = 0;
            if (nzEnd > nzStart) {
                int len = nzEnd - nzStart;
                currentMul = (hash[nzEnd] - (hash[nzStart] * power10[len]) % mod + mod) % mod;
            }

            long product = (currentMul * (currentSum % mod)) % mod;

            if (product > 1000000000L) {
                arr[i] = (int) (product % mod);
            } else {
                arr[i] = (int) product;
            }
        }

        return arr;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
            static int countBits(int n) {
            int count = 0;
            while (n > 0) {
                n = n & (n - 1);
                count++;
            }
            return count;
        }
        public static int[] sortByBits(int[] arr) {
            Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
            Arrays.sort(temp, (a, b) -> {
                int bitA = countBits(a);
                int bitB = countBits(b);

                if (bitA == bitB)
                    return a - b;   
                return bitA - bitB;
            });
            for (int i = 0; i < arr.length; i++)
                arr[i] = temp[i];
            return arr;
        }
}
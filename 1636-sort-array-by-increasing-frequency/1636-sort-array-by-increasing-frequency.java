import java.util.ArrayList;
import java.util.List;

class Solution {
    static{
        for (int i = 0;i < 500;i++) {
            frequencySort(new int[0]);
        }
    }
    public static int[] frequencySort(int[] nums) {
        int n = nums.length;
        int[] freq = new int[201];
        int maxFreq = 0;
        for (int num:nums) {
            freq[num+ 100]++;
            maxFreq = Math.max(maxFreq,freq[num + 100]);
        }
        ArrayList<Integer>[] bukcet = new ArrayList[maxFreq + 1];
    for (int i = 0;i < 201;i++) {
            int f = freq[i];
            if (f ==0) continue;
            if (bukcet[f] == null) bukcet[f] = new ArrayList<>();
            for (int j = 0;j < f;j++) bukcet[f].add(i- 100);
        }
        int[] ans= new int[n];
        int k = 0;
        for (List<Integer> list:bukcet) {
            if (list == null) continue;
            for (int i = list.size() - 1;i >=0;i--) {
                ans[k++] = list.get(i);
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
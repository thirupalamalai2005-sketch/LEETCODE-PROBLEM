import java.util.*;

class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        Set<Integer> used = new HashSet<>();
        int deletions = 0;

        for(int f : freq) {
            while(f > 0 && used.contains(f)) {
                f--;    
                deletions++;
            }
            if(f > 0) {
                used.add(f);
            }
        }
        return deletions;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
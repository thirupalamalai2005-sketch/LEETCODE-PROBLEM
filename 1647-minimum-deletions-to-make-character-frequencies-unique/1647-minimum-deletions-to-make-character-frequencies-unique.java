import java.util.*;

class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int arr[]=new int[s.length()+1];
        int deletions = 0;

        for(int f : freq) {
            while(f > 0 && arr[f]!=0) {
                f--;    
                deletions++;
            }
            if(f > 0) {
                arr[f]++;
            }
        }
        return deletions;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
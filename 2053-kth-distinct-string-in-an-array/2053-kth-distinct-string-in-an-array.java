import java.util.*;

class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> freq= new HashMap<>();
        for (String s:arr) {
            freq.put(s,freq.getOrDefault(s,0)+1);
        }
        int count=0;
        for (String s:arr) {
            if (freq.get(s)==1) {
                count++;
                if (count==k) {
                    return s;
                }
            }
        }
        return "";
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
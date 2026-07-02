class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count=0;
        for(String a:operations){
            if(a.indexOf('+')!=-1){
                count++;
                continue;
            }
            count--;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
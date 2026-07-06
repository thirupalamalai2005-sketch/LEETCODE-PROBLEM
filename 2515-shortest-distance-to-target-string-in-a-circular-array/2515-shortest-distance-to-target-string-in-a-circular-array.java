class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
       int sum=Integer.MAX_VALUE;
       int j=words.length;
       for(int i=0;i<j;i++){
        if(words[i].equals(target)){
            sum=Math.min(Math.min(Math.abs(i-startIndex),j-Math.abs(i-startIndex)),sum);
        }
       }
        return sum>100?-1:sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public int totalNumbers(int[] digits) {
         Set<Integer> res = new HashSet<>();
        int n = digits.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i==j||j==k||i==k) continue; 
                    int a=digits[i], b=digits[j], c=digits[k];
                    if(a==0) continue;  
                    if(c%2!=0) continue;
                    res.add(a*100+b*10+c);
                }
            }
        }
        return res.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
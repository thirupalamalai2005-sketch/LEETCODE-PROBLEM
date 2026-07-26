class Solution {
    public int maxProduct(int n) {
        int first=0;
        int second=0;
        while(n>0){
          int temp=n%10;
          if(temp>=first){
            second=first;
            first=temp;
          }else if(temp>=second && temp<=first){
            second=temp;
          }
          n/=10;
        }
        return first*second;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
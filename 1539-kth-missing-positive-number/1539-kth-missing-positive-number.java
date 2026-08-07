class Solution {
    public int findKthPositive(int[] arr, int k) {
       int left=0,right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int miss=arr[mid]-(mid+1);
            if (miss<k) {
                left=mid+1;
            } else {
                right=mid-1;
            }
        }
        return k+left;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
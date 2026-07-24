class Solution {
    public int[] replaceElements(int[] arr) {
        int max=-1;
        for (int i=arr.length-1;i>=0;i--) {
            int temp=arr[i];
            arr[i]=max;
            if (temp>max){ 
                max=temp;
            }
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
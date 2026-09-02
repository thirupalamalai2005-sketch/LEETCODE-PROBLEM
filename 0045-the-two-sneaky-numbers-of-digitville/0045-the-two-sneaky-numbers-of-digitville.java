class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[]=new int[101];
        int res[]=new int[2];
        int j=0;
        for(int num:nums){
            arr[num]++;
            if(arr[num]>1){
                res[j]=num;
                j++;
            }
            if(j==2){
                break;
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
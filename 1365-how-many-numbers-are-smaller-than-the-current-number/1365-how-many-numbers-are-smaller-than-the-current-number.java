class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count=0;
        int arr[]=new int[101];
        int max=0;
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
            max=Math.max(max,nums[i]);
        }
        int k=0;
        int res[]=new int[max+1];
        for(int j=0;j<=max;j++){
            int temp=arr[j];
            while(temp>0){
                res[j]=count;
                temp--;
                k++;
            }
            count+=arr[j];
        }
        for(int j=0;j<nums.length;j++){
            nums[j]=res[nums[j]];
        }
        return nums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
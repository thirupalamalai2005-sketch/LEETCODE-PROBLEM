class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int arr[]=new int[101];
        int arr2[]=new int[101];
        int max=0;
        for(int i:nums1){
            arr[i]++;
            max=Math.max(i,max);
        }
        for(int j:nums2){
            arr2[j]++;
            max=Math.max(j,max);
        }
        int co1=0;
        int co2=0;
        for(int i=0;i<=max;i++){
            if(arr[i]!=0 && arr2[i]!=0){
                co1+=arr[i];
                co2+=arr2[i];
            }
        }
        return new int[]{co1,co2};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
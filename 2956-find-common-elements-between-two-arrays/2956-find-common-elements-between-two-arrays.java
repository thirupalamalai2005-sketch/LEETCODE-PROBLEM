class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int arr[]=new int[101];
        int arr2[]=new int[101];
        for(int i:nums1){
            arr[i]++;
        }
        for(int j:nums2){
            arr2[j]++;
        }
        int co1=0;
        int co2=0;
        for(int i:nums1){
            if(arr2[i]!=0){
                co1++;
            }
        }
        for(int i:nums2){
            if(arr[i]!=0){
                co2++;
            }
        }
        return new int[]{co1,co2};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
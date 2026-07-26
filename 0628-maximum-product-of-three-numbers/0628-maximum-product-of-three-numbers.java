class Solution {
    public int maximumProduct(int[] nums) {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        int small =Integer.MAX_VALUE;
        int smalls=Integer.MAX_VALUE;
        for(int num:nums){
            if(num>first){
                third=second;
                second=first;
                first=num;
            }else if(num>second){
                third=second;
                second=num;
            }else if(num>third){
                third=num;
            }
            if(num<small){
                smalls=small;
                small=num;
            }
            else if(num<smalls){
                smalls=num;
            }
        }
        return Math.max(first*second*third,small*smalls*first);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
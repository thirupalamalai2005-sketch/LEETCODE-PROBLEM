class Solution{
public int countValidSelections(int[] nums){
    int total=0;
    for(int x:nums){
        total+=x;
    }
    int left=0,ans=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            int right=total-left;
            if(left==right){
                ans+=2;
            }else if(Math.abs(left-right)==1){
                ans++;
            }
        }else{
            left+=nums[i];
        }
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
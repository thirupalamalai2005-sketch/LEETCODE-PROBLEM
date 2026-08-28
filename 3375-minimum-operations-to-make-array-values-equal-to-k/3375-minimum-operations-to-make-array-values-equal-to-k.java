class Solution{
public int minOperations(int[] nums,int k){
    int[] arr=new int[101];
    int count=0;
    for(int num:nums){
        arr[num]++;
    }
    for(int i=0;i<101;i++){
        if(arr[i]>0){
            if(i<k){
                return -1;
            }
            if(i>k){
                count++;
            }
        }
    }
    return count;
  }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
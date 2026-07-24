class Solution {
    public int findSpecialInteger(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        int curr=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==curr){
                count++;
            }else{
                curr=arr[i];
                count=1;
            }
            if(count>arr.length/4){
                return curr;
            }
        }
        return curr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
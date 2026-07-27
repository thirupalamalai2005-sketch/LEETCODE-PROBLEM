class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int len=nums1.length;
        int len2=nums2.length;
        while(i<len || j<len2){
            int tem1=nums1[i];
            int tem2=nums2[j];
            if(i==len-1 && tem1<tem2 || j==len2-1 && tem2<tem1){
                break;
            }else if(tem1==tem2){
                return tem1;
            }else if(tem1>tem2){
                j++;
            }else{
                i++;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
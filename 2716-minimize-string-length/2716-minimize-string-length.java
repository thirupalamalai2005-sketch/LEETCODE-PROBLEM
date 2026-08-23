class Solution {
    public int minimizedStringLength(String s) {
        int res=0;
        int arr[]=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
            if(arr[c-'a']==1 ){
                res++;
            } 
            if(res==26){
                break;
            }           
        }
        return res;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public int numberOfSpecialChars(String word) {
        int arr[]=new int[52];
        for(int i=0;i<word.length();i++){
            char temp=word.charAt(i);
            if(temp>64  && temp<91){
                arr[temp-'A']++;
            }else{
                arr[temp-'a'+26]++;
            }
        }
        int i=25;
        int j=51;
        int count=0;
        while(i>=0){
            if(arr[i]>=1 && arr[j]>=1){
                count++;
            }
            i--;
            j--;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
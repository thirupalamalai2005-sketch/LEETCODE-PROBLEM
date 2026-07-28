class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==3){
            return s;
        }
          int arr[]=new int[26];
          for(char ch:s.toCharArray()){
            arr[ch-'a']++;
          }
        StringBuilder front=new StringBuilder();
        StringBuilder mid=new StringBuilder();
        for(int i=0;i<26;i++){
            while(arr[i]>=2){
                front.append((char)('a'+i));
                arr[i]-=2;
            }
            if(arr[i]==1&&mid.length()==0){
                mid.append((char)('a'+i));
                arr[i]--;
            }
        }
        String back=front.reverse().toString();
        front.reverse();
        return front.toString()+mid.toString()+back;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq=new int[26];
        boolean[] vis=new boolean[26];
        for(char c:s.toCharArray())freq[c-'a']++;
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            freq[c-'a']--;
            if(vis[c-'a'])continue;
            while(sb.length()>0&&sb.charAt(sb.length()-1)>c&&freq[sb.charAt(sb.length()-1)-'a']>0){
                vis[sb.charAt(sb.length()-1)-'a']=false;
                sb.deleteCharAt(sb.length()-1);
            }
            sb.append(c);
            vis[c-'a']=true;
        }
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
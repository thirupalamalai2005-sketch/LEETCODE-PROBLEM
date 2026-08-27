class Solution{
    public String lexGreaterPermutation(String s,String target){
        int[] freq=new int[26];

        for(char c:s.toCharArray())
            freq[c-'a']++;

        int n=target.length();

        for(int i=0;i<n;i++){
            int x=target.charAt(i)-'a';

            if(freq[x]>0){
                freq[x]--;
                continue;
            }

            for(int j=x+1;j<26;j++){
                if(freq[j]>0){
                    StringBuilder ans=new StringBuilder(target.substring(0,i));
                    ans.append((char)(j+'a'));
                    freq[j]--;

                    for(int k=0;k<26;k++){
                        while(freq[k]>0){
                            ans.append((char)(k+'a'));
                            freq[k]--;
                        }
                    }

                    return ans.toString();
                }
            }

            for(int j=i-1;j>=0;j--){
                int y=target.charAt(j)-'a';
                freq[y]++;

                for(int k=y+1;k<26;k++){
                    if(freq[k]>0){
                        StringBuilder ans=new StringBuilder(target.substring(0,j));
                        ans.append((char)(k+'a'));
                        freq[k]--;

                        for(int m=0;m<26;m++){
                            while(freq[m]>0){
                                ans.append((char)(m+'a'));
                                freq[m]--;
                            }
                        }

                        return ans.toString();
                    }
                }
            }

            return "";
        }
        for(int i=n-1;i>=0;i--){
            int x=target.charAt(i)-'a';
            freq[x]++;

            for(int j=x+1;j<26;j++){
                if(freq[j]>0){
                    StringBuilder ans=new StringBuilder(target.substring(0,i));
                    ans.append((char)(j+'a'));
                    freq[j]--;

                    for(int k=0;k<26;k++){
                        while(freq[k]>0){
                            ans.append((char)(k+'a'));
                            freq[k]--;
                        }
                    }

                    return ans.toString();
                }
            }
        }

        return "";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
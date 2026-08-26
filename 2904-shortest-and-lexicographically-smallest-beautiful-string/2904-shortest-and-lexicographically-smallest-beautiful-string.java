class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        if(k==1 && s.indexOf('1')!=-1){
            return "1";
        }

        int i=0;
        int len=s.length();
        String res="";

        while(i<len){

            int j=i;
            int l=i;
            int temp=0;

            while(j<len && temp!=k){

                if(s.charAt(j)=='1'){
                    temp++;
                }

                if(temp==k){
                    l=j;
                }

                j++;
            }

            if(temp==k){

                String cur=s.substring(i,j);

                if(res.equals("") ||
                   cur.length()<res.length() ||
                   (cur.length()==res.length() && cur.compareTo(res)<0)){
                    res=cur;
                }

            }else{
                break;
            }

            i++;
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
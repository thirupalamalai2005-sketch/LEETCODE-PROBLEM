class Solution {
    public String defangIPaddr(String address) {
        String res="";
        int i=address.length()-1;
        while(i>=0){
            String temp="[.]";
            if(address.charAt(i)=='.'){
                res=temp+res;
                i--;
                continue;
            }
            res=address.charAt(i)+res;
            i--;
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
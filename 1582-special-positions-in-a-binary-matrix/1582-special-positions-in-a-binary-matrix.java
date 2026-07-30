class Solution {
    public int numSpecial(int[][] mat) {
        int len=mat.length;
        int len1=mat[0].length;
        int ari[]=new int[len];
        int arj[]=new int[len1];
        for(int i=0;i<len;i++){
            for(int j=0;j<len1;j++){
                if(mat[i][j]==1){
                    ari[i]++;
                    arj[j]++;
                }
            }
        }
        int count=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<len1;j++){
                if(mat[i][j]==1 && ari[i]==1 && arj[j]==1){
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
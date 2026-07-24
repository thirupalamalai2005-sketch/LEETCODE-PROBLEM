class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int arr[]=new int[2];
        int len=mat.length;
        int max=0;
        for(int i=0;i<len;i++){
            int count=0;
            for(int j=0;j<mat[i].length;j++){
                int temp=mat[i][j];
                if(temp==1){
                    count++;
                }
            }
            if(count>max){
                arr[0]=i;
                arr[1]=count;
                max=count;
            }
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public int findLucky(int[] arr) {
        int ar[]=new int[501];
        int max=0;
        for(int num:arr){
            if(num>max){
                max=num;
            }
            ar[num]++;
        }
        int count=0;
        int luck=0;
        int k=0;
        for(int i=1;i<=max;i++){
            int temp=ar[i];
            if(temp==i){
                luck=temp;
                k+=i;
                count++;
                continue;
            }
        }
        return (k==arr.length && count>1)?count:(luck==0)?-1:luck;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
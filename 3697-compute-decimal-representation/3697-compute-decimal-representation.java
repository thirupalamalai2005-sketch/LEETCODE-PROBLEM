class Solution {
    public int[] decimalRepresentation(int n) {
        int size=0;
        int temp=n;
        while(temp>0){
            if(temp%10!=0){
                size++;
            }
            temp/=10;
        }
        int arr[]=new int[size];
        int num=1;
        while(n>0){
            int tem=n%10;
            if(tem!=0){
                arr[size-1]=tem*num;
                size--;
            }
            num*=10;
            n/=10;
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
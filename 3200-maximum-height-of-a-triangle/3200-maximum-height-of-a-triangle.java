class Solution{
    public int maxHeightOfTriangle(int red,int blue){
        int ans1=check(red,blue);
        int ans2=check(blue,red);
        return Math.max(ans1,ans2);
    }
    static int check(int red,int blue){
        int i=1;
        int count=0;
        while(true){
            boolean ch=(i%2!=0&&red>=i)||(i%2==0&&blue>=i);
            if(ch){
                count++;
                if(i%2!=0){
                    red-=i;
                }else{
                    blue-=i;
                }
                i++;
            }else{
                break;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
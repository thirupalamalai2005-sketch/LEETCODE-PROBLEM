class Solution {
    public int maxDistance(int[] colors) {
        int first=colors[0];
        int second=0;
        int firstdistance=0;
        int seconddistance=0;;
        int len=colors.length;
        for(int i=1;i<len;i++){
            int temp=colors[i];
            if(temp!=first){
                seconddistance=i;
            }
            if(temp!=first && second==0){
                second=i;
            }else if(temp==first){
                firstdistance=i;
            }
        }
        return Math.max(Math.abs(0-seconddistance),Math.abs(firstdistance-second));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
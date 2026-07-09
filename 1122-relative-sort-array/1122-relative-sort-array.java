class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int arr[]=new int[1001];
        int max=0;
        int min=0;
        for(int i=0;i<arr1.length;i++){
            arr[arr1[i]]++;
            max=Math.max(max,arr1[i]);
            min=Math.min(min,arr1[i]);
        }
        int j=0;
        for(int i=0;i<arr2.length;i++){
            int temp=arr[arr2[i]];
            while(temp>0){
               arr1[j]=arr2[i];
               temp--;
               j++;
            }
            arr[arr2[i]]=0;
        }
        for(int i=min;i<=max;i++){
            int temp1=arr[i];
            while(temp1>0){
                arr1[j]=i;
                temp1--;
                j++;
            }
            arr[i]=0;
        }
        return arr1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
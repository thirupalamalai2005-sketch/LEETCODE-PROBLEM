class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int[] seatCount = new int[101];
        int[] studentCount = new int[101];
        
        for (int s : seats) seatCount[s]++;
        for (int st : students) studentCount[st]++;
        
        int i = 0, j = 0;
        int sum = 0;
        
        // Walk through both arrays like a two-pointer approach
        while (i <= 100 && j <= 100) {
            // Skip empty positions
            while (i <= 100 && seatCount[i] == 0) i++;
            while (j <= 100 && studentCount[j] == 0) j++;
            
            if (i > 100 || j > 100) break;
            
            // Match one student to one seat
            sum += Math.abs(i - j);
            
            seatCount[i]--;
            studentCount[j]--;
        }
        
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
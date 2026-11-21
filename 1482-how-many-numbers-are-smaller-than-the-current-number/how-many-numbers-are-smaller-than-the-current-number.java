class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
         // Step 1: Count frequencies of each number (assuming numbers range 0 to 100)
        int[] counts = new int[101];
        for (int num : nums) {
            counts[num]++;
        }
        
        // Step 2: Transform counts array into running sums of smaller elements
        int runningSum = 0;
        int[] smallerThan = new int[101];
        for (int i = 0; i < 101; i++) {
            smallerThan[i] = runningSum;
            runningSum += counts[i];
        }
        
        // Step 3: Map original values to their counts
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = smallerThan[nums[i]];
        }
        return result ;
    }
}
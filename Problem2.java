// Time Complexity : O(1)
// Space Complexity : O(1)
// Passed Leetcode

class Solution {
    public int singleNumber(int[] nums) {
        
        if (nums.length == 0)
            return -1;
        
        int rem = 0;
        for (int n : nums) {
            
            rem = n ^ rem;
            
        }
        return rem;
    }
}
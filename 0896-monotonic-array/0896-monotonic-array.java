class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        if(n==1) return true;

        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 1 ; i < n ; i++){
            if(!increasing && !decreasing) {
                return false;
            }
            if(nums[i] < nums[i-1]) {
                increasing = false;
            }
            if(nums[i] > nums[i-1]) {
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }
}
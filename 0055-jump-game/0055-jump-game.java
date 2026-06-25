class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            // agar current index not reachable hai
            if (i > maxReach) {
                return false;
            }

            // max reachable update karo
            maxReach = Math.max(maxReach , i+nums[i]);
        }
        return true;
    }
}
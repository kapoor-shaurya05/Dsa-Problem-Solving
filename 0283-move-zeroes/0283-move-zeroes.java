class Solution {
    public void moveZeroes(int[] nums) {
        // int j = 0;

        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] != 0){
        //         nums[j] = nums[i];
        //         j++;
        //     }
        // }

        // while(j < nums.length){
        //     nums[j] = 0;
        //     j++;
        // }

        int j = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] !=0 && nums[j]==0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if(nums[j] != 0){
                j++;
            }
        }
}
}
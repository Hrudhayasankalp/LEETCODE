class Solution {
    public int findPoisonedDuration(int[] nums, int d) {
        int t=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<=nums[i]+d-1){
                t+=nums[i+1]-nums[i];
            }
            else t+=d;
        }
        t+=d;
        return t;
    }
}
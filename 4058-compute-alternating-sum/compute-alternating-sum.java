class Solution {
    public int alternatingSum(int[] nums) {
        int sum=0,sum1=0,n=nums.length;
        for(int i=0;i<n;i+=2){
            sum+=nums[i];
        }
        for(int i=1;i<n;i+=2){
            sum1+=nums[i];
        }
        return sum-sum1;
    }
}
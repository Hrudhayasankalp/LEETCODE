class Solution {
    public boolean predictTheWinner(int[] nums) {
       return score(nums,0,nums.length-1)>=0;
    }
    private int score(int[] nums,int i,int j){
        if(i==j)return nums[i];

        int l=nums[i]-score(nums,i+1,j);
        int r=nums[j]-score(nums,i,j-1);

        return Math.max(l,r);
    }
}
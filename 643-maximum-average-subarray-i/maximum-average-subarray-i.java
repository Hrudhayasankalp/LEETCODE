class Solution {
    public double findMaxAverage(int[] nums, int k) {
            double avg=0,sum=0;
            for(int i=0;i<k;i++){
                sum+=nums[i];
            }
            avg=sum;
            int i=0,j=k;
            while(j<nums.length){
                sum-=nums[i];
                i++;
                sum+=nums[j];
                j++;
                avg=Math.max(sum,avg);
            }
            return avg/k;
    }
}
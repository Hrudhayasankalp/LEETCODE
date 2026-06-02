class Solution {
    public double findMaxAverage(int[] nums, int k) {
            double avg=0,sum=0;
            for(int i=0;i<k;i++){
                sum+=nums[i];
            }
            avg=sum;
            int j=k;
            while(j<nums.length){
                sum+=nums[j]-nums[j-k];
                j++;
                avg=Math.max(avg,sum);
            }
            return avg/k;
    }
}
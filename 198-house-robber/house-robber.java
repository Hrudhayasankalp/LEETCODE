class Solution {
    public int rob(int[] nums) {  
        int[] a=new int[nums.length];      
        return f(nums,0,a);
    }

    int f(int[] nums, int i, int[] a){      
     if(i>=nums.length) return 0;
     if(a[i]!=0) return a[i];
        while(i<nums.length-1 && nums[i]==0) i++;
     int take=nums[i]+f(nums, i+2, a);
     int notTake=f(nums, i+1, a);
     a[i]=Math.max(take,notTake);
     return a[i];
    }
}